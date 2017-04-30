/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.util.MSSQLConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author VuDang
 */
public class GetTimeSlot extends HttpServlet {

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
        String idyard = request.getParameter("id");
        String date = request.getParameter("date");
        MSSQLConnection db = new MSSQLConnection();
      JSONArray list_tslot = new JSONArray();
        try {
            ResultSet rs = db.query("Select * from timeslot where IDTimeSlot not in"
                    + " (select IDTimeSlot from bookyard "
                    + "where IDYard = '" + idyard + "' and DateBook = '" + date + "')");
            while (rs.next()) {
                JSONObject obj = new JSONObject();
                //TimeSlot timeslot = new TimeSlot();
                obj.put("IDTimeSlot",rs.getInt("IDTimeSlot"));
                obj.put("TimeSlot",rs.getString("TimeSlot"));
                list_tslot.add(obj);
            }
        } catch (Exception ex) {
            Logger.getLogger(GetTimeSlot.class.getName()).log(Level.SEVERE, null, ex);
        }
        String json = list_tslot.toJSONString();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
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
