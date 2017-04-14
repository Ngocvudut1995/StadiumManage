/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.filter;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VuDang
 */
public class MyServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //To change body of generated methods, choose Tools | Templates.
         HttpSession session = req.getSession();
        if (session.getAttribute("MemberID") == null) {
            resp.sendRedirect("login.jsp");
        } else {
            super.service(req, resp);
            //chain.doFilter(request, response);
        }
    } 
}
