/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.util.MSSQLConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VuDang
 */
public class HomeView {
     public List<Yard> yard_5 ;
        public List<Yard> yard_7 ;

    public HomeView() {
        MSSQLConnection db = new MSSQLConnection();
        yard_5 = new ArrayList<>();
        yard_7 = new ArrayList<>();
        try {
            ResultSet rs_yard = db.query("Select * from yard where TypeYard = '5' and Status = 'activiting'");
            while (rs_yard.next()) {
               Yard yard = new Yard();
               yard.setIDYard(rs_yard.getString("IDYard"));
               yard.setImage(rs_yard.getString("Image"));
               yard.setNameYard(rs_yard.getString("NameYard"));
                yard_5.add(yard);
            }
             rs_yard = db.query("Select * from yard where TypeYard = '7' and Status = 'activiting'");
            while (rs_yard.next()) {
               Yard yard = new Yard();
               yard.setIDYard(rs_yard.getString("IDYard"));
               yard.setImage(rs_yard.getString("Image"));
               yard.setNameYard(rs_yard.getString("NameYard"));
            
                yard_7.add(yard);
            }
            
        } catch (Exception e) {
        }
    }
        
}
