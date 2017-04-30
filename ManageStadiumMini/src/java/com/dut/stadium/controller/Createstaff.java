/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.model.Account;
import com.dut.stadium.model.AccountStaff;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import util.Encode;

/**
 *
 * @author VuDang
 */
public class Createstaff extends HttpServlet {

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
            out.println("<title>Servlet Createstaff</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Createstaff at " + request.getContextPath() + "</h1>");
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
         request.setCharacterEncoding("UTF-8");
   BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),StandardCharsets.UTF_8));
        String json = "";
        if(br != null){
            json = br.readLine();
        } 
        
        JSONParser parser = new JSONParser();
         try {
            JSONObject data = (JSONObject) parser.parse(json);
             AccountStaff accountStaff = new AccountStaff();
             Account account = new Account();
              account.setIDAccount(UUID.randomUUID().toString());
             account.setNameAccount(data.get("NameAccount").toString());
             account.setAddress(data.get("Address").toString());
             
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date d = new Date(df.parse(data.get("Birthday").toString()).getTime());
           //  Date date = new Date(data.get("Birthday").toString());
             account.setBirthday(d);
             account.setEmail(data.get("Email").toString());
             account.setIdentification(data.get("Identification").toString());
             account.setPhone(data.get("Phone").toString());
             account.setPassword(Encode.getSecurePassword(data.get("Phone").toString(), "DUT"));
             accountStaff.account = account;
             accountStaff.setPosition(data.get("Position").toString());
             accountStaff.setSalary(Double.parseDouble(data.get("Salary").toString()));
            if (accountStaff.add()) {
               
                response.getWriter().write("True");
               
            } else {
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write("False");
            }
           // response.sendRedirect("home.jsp");
        } catch (Exception e) {
            System.out.println("sds");          
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
