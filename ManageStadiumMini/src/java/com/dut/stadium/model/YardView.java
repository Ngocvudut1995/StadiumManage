/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.controller.GetTimeSlot;
import com.dut.stadium.util.MSSQLConnection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuDang
 */
public class YardView {

    public Yard Yard;
    public List<TimeSlot> ListTimeslot;
    public Account Account;

    public YardView getID(String id) {
        MSSQLConnection db = new MSSQLConnection();
        try {
            SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
            Yard = new Yard();
            Yard = Yard.getByID(id);
            ListTimeslot = new ArrayList<>();
            ResultSet rs = db.query("Select * from timeslot where IDTimeSlot not in"
                    + " (select IDTimeSlot from bookyard "
                    + "where IDYard = '" + id + "' and DateBook = '" + sdfr.format(new Date()) + "')");
            while (rs.next()) {
                TimeSlot timeslot = new TimeSlot();
                timeslot.setIDTimeSlot(rs.getInt("IDTimeSlot"));
                timeslot.setTimeSlot(rs.getString("TimeSlot"));
                ListTimeslot.add(timeslot);

            }

        } catch (Exception ex) {
            Logger.getLogger(YardView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
}
