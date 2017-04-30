/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.util.MSSQLConnection;
import com.dut.stadium.util.ValidateLogin;
import com.sun.net.httpserver.Authenticator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import util.Encode;

/**
 *
 * @author VuDang
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),StandardCharsets.UTF_8));
        String json = "";
        if(br != null){
            json = br.readLine();
        } 
        JSONParser parser = new JSONParser();
      
        try {
             JSONObject data = (JSONObject) parser.parse(json);
            // Lay gia tri nguoi dung
            String strEmail =  data.get("Email").toString();
            String strPassword = data.get("Password").toString();
            MSSQLConnection db = new MSSQLConnection();
            ResultSet rs = db.query("Select * from account where Email = '"+strEmail+"' "
                    + "and Password = '"+Encode.getSecurePassword(strPassword, "DUT")+"'");
        if(rs.next())
        {
            HttpSession session = request.getSession();
            session.setAttribute("userid", rs.getString("IDAccount"));
              session.setAttribute("name", rs.getString("NameAccount"));
              ResultSet rs_staff = db.query("select * from staff where IDStaff = '" + rs.getString("IDAccount") + "'");
                if (rs_staff.next()) {
                    if (rs_staff.getString("Position").equalsIgnoreCase("Employee")) {
                          session.setAttribute("role", "2");
                    }else{
                         session.setAttribute("role", "1");
                    }
                }else{
                    session.setAttribute("role", "3");
                }
              response.getWriter().write("True");
       
        }
        else
        {
            response.getWriter().write("False");
        }
        } catch (Exception e) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
