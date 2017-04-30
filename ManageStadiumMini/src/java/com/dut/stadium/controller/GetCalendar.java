/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.controller;

import com.dut.stadium.util.MSSQLConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class GetCalendar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          JSONArray listbookCalenders = new JSONArray();
           String idyard = request.getParameter("id");
        String date = request.getParameter("date");
        
         MSSQLConnection db = new MSSQLConnection();
        try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date d = new Date(df.parse(date).getTime());
             SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs_bookyard = db.query("Select * from bookyard where DateBook = '"+sdfr.format(d)+"' "
                    + "and IDYard = '"+idyard+"'");
            while (rs_bookyard.next()) {
                JSONObject obj = new JSONObject();
                  String[] list_service = rs_bookyard.getString("ListIDService").split(",");
                //TimeSlot timeslot = new TimeSlot();
                 double pricetotal = 0;
                for (String list_service1 : list_service) {
                    ResultSet rs_service = db.query("Select * from service "
                            + "where IDService = " + Integer.parseInt(list_service1));
                    if(rs_service.next()){
                        pricetotal += rs_service.getDouble("Price");
                    }
                }
                     ResultSet rs_yard = db.query("Select * from yard "
                                 + "where IDYard = '"+rs_bookyard.getString("IDYard")+"'");
                     if(rs_yard.next()){
                          pricetotal += rs_yard.getDouble("Price");
                     }
                    
                obj.put("TotalPrice",pricetotal);
                 ResultSet rs_timeslot = db.query("Select TimeSlot from timeslot "
                                 + "where IDTimeSlot = "+rs_bookyard.getInt("IDTimeSlot"));
                if( rs_timeslot.next()){
                    obj.put("TimeSlot",rs_timeslot.getString("TimeSlot"));
                };
                obj.put("DateBook",rs_bookyard.getDate("DateBook").toString());
                
                listbookCalenders.add(obj);
            }
        } catch (Exception ex) {
            Logger.getLogger(GetTimeSlot.class.getName()).log(Level.SEVERE, null, ex);
        }
        String json = listbookCalenders.toJSONString();
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
