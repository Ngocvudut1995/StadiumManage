/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.model.Account;
import com.dut.stadium.model.AccountCustomer;
import com.dut.stadium.util.MSSQLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
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
public class BookYard extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), StandardCharsets.UTF_8));
        String json = "";
        if (br != null) {
            json = br.readLine();
        }
        MSSQLConnection db = new MSSQLConnection();
        JSONParser parser = new JSONParser();
        com.dut.stadium.model.BookYard book = new com.dut.stadium.model.BookYard();

        try {
            JSONObject data = (JSONObject) parser.parse(json);
            ResultSet rs_email = db.query("Select * from account where Email ='" + data.get("Email").toString() + "'");
            if (rs_email.next()) {
                book.setIDCustomer(rs_email.getString("IDAccount"));
            } else {
                AccountCustomer newAccount = new AccountCustomer();
                String id = UUID.randomUUID().toString();
                newAccount.account.setIDAccount(id);
                newAccount.account.setAddress(data.get("Address").toString());
                newAccount.account.setPhone(data.get("Phone").toString());
                newAccount.account.setNameAccount(data.get("NameAccount").toString());
                newAccount.account.setEmail(data.get("Email").toString());
                newAccount.account.setPassword(Encode.getSecurePassword(data.get("Phone").toString(), "DUT"));
                newAccount.add();
                book.setIDCustomer(id);
            }
            book.setIDYard(data.get("IDYard").toString());
            book.setContents(data.get("Contents").toString());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date d = new Date(df.parse(data.get("DateBook").toString()).getTime());
            book.setDateBook(d);
            book.setIDTimeSlot(Integer.parseInt(data.get("IDTimeSlot").toString()));
            book.setStatus(0);
            book.setListIDService(data.get("ListIDService").toString());
            if(book.add()){
                 response.getWriter().write("True");
                 return;
            }
             response.getWriter().write("True");
            return;
        } catch (Exception e) {
            System.out.println("sds");
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
        processRequest(request, response);
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
