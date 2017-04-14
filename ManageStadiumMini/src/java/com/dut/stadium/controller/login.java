/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        try {
            // Lay gia tri nguoi dung
            String strUsername = request.getParameter("username").toString();
            String strPassword = request.getParameter("password").toString();
            String checkRememberme = request.getParameter("checkbox").toString();
            // xu ly tinh toan
            if (strUsername.equalsIgnoreCase("") || strPassword.equalsIgnoreCase("")) {
                String error = "You must type something!";
                request.setAttribute("errors", error);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                //response.sendRedirect("login.jsp?error=305");

            } else if (strUsername != "" && strPassword != "") {
                if (strUsername.length() < 3 || strPassword.length() < 3) {
                    response.sendRedirect("login.jsp?error=304");
                    return;
                }
                if (strUsername.equalsIgnoreCase("admin")
                        && strPassword.equalsIgnoreCase("admin")) {
//                    HttpSession session = request.getSession();
//                    session.setAttribute("MemberID","1");
//                    session.setAttribute("Username","ngocvu");   
                    if (checkRememberme.equalsIgnoreCase("on")) {
                        Cookie userCookie = new Cookie("user", strUsername);
                        userCookie.setMaxAge(60 * 60 * 24 * 365); //Store cookie for 1 year
                        response.addCookie(userCookie);
                        
                    }
                    response.sendRedirect("home.jsp");

                } else {

                    response.sendRedirect("login.jsp?error=303");
                }
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
