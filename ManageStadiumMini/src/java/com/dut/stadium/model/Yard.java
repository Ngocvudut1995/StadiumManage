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
public class Yard {

    private String IDYard;
    private String NameYard;
    private String TypeYard;
    private String Status;
    private double Price;
    private String Image;
    private String Decription;

    public List<Yard> getAll() {
        MSSQLConnection db = new MSSQLConnection();
        List<Yard> list_yard = new ArrayList<>();
        try {
            ResultSet rs = db.query("Select * from yard");
            while (rs.next()) {
                Yard yard = new Yard();
                yard.setIDYard(rs.getString("IDYard"));
                yard.setNameYard(rs.getString("NameYard"));
                yard.setImage(rs.getString("Image"));
                yard.setPrice(rs.getDouble("Price"));
                yard.setStatus(rs.getString("Status"));
                yard.setTypeYard(rs.getString("TypeYard"));
                list_yard.add(yard);
            }

        } catch (Exception ex) {

        }
        return list_yard;
    }

    public Yard getByID(String id) {
        MSSQLConnection db = new MSSQLConnection();
        Yard yard = new Yard();
        try {
            ResultSet rs = db.query("Select * from yard where IDYard = '" + id + "'");
            if (rs.next()) {

                yard.setIDYard(rs.getString("IDYard"));
                yard.setNameYard(rs.getString("NameYard"));
                yard.setImage(rs.getString("Image"));
                yard.setPrice(rs.getDouble("Price"));
                yard.setStatus(rs.getString("Status"));
                yard.setTypeYard(rs.getString("TypeYard"));

            }

        } catch (Exception ex) {

        }
        return yard;
    }

    public String getIDTuTang() {
        MSSQLConnection db = new MSSQLConnection();
        Yard yard = new Yard();
        try {
            ResultSet rs = db.query("Select * from yard ORDER BY IDYard DESC limit 1");
            if (rs.next()) {
                String tiento = rs.getString("IDYard").substring(0, 2);
                int hauto = Integer.parseInt(rs.getString("IDYard").substring(2)) + 1;
                StringBuilder sb = new StringBuilder();
                sb.append(tiento);
                sb.append(hauto);
                return sb.toString();
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public String getIDYard() {
        return IDYard;
    }

    public void setIDYard(String IDYard) {
        this.IDYard = IDYard;
    }

    public String getNameYard() {
        return NameYard;
    }

    public void setNameYard(String NameYard) {
        this.NameYard = NameYard;
    }

    public String getTypeYard() {
        return TypeYard;
    }

    public void setTypeYard(String TypeYard) {
        this.TypeYard = TypeYard;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String Decription) {
        this.Decription = Decription;
    }
}
