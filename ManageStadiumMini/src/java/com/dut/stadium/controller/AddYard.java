/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.model.Account;
import com.dut.stadium.model.AccountStaff;
import com.dut.stadium.model.Yard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author VuDang
 */
public class AddYard extends HttpServlet {

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
            out.println("<title>Servlet AddYard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddYard at " + request.getContextPath() + "</h1>");
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
       BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),StandardCharsets.UTF_8));
        String json = "";
        if(br != null){
            json = br.readLine();
        } 
        
        JSONParser parser = new JSONParser();
         try {
            JSONObject data = (JSONObject) parser.parse(json);
             Yard yard = new Yard();
            
             yard.setIDYard(data.get("IDYard").toString());
             yard.setNameYard(data.get("NameYard").toString());
             yard.setStatus(data.get("Status").toString());
             yard.setDecription(data.get("Decription").toString());
             yard.setTypeYard(data.get("TypeYard").toString());
             yard.setPrice(Double.parseDouble(data.get("Price").toString()));
             
            
            if (yard.add()) {
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
