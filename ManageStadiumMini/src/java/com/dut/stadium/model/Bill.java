/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.util.MSSQLConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuDang
 */
public class Bill {
    
	private String IDBill;
	private String IDStaff ;
	private String IDYard ;
	private String IDCustomer;
	private int IDTimeSlot;
	private String ListIDService;
	private boolean Status;
	private double PriceYard;
	private double PriceService;
	private int Promotion;
	private Date DatePay;
        
    public String getIDBill() {
        return IDBill;
    }

    public void setIDBill(String IDBill) {
        this.IDBill = IDBill;
    }

    public String getIDStaff() {
        return IDStaff;
    }

    public void setIDStaff(String IDStaff) {
        this.IDStaff = IDStaff;
    }

    public String getIDYard() {
        return IDYard;
    }

    public void setIDYard(String IDYard) {
        this.IDYard = IDYard;
    }

    public String getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(String IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public int getIDTimeSlot() {
        return IDTimeSlot;
    }

    public void setIDTimeSlot(int IDTimeSlot) {
        this.IDTimeSlot = IDTimeSlot;
    }

    public String getListIDService() {
        return ListIDService;
    }

    public void setListIDService(String ListIDService) {
        this.ListIDService = ListIDService;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public double getPriceYard() {
        return PriceYard;
    }

    public void setPriceYard(double PriceYard) {
        this.PriceYard = PriceYard;
    }

    public double getPriceService() {
        return PriceService;
    }

    public void setPriceService(double PriceService) {
        this.PriceService = PriceService;
    }

    public int getPromotion() {
        return Promotion;
    }

    public void setPromotion(int Promotion) {
        this.Promotion = Promotion;
    }

    public Date getDatePay() {
        return DatePay;
    }

    public void setDatePay(Date DatePay) {
        this.DatePay = DatePay;
    }
        
}
