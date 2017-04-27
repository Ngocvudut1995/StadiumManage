/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

/**
 *
 * @author VuDang
 */
public class Service {
   
	private int IDService; 
	private String NameService;
	private double Price;

    public int getIDService() {
        return IDService;
    }

    public void setIDService(int IDService) {
        this.IDService = IDService;
    }

    public String getNameService() {
        return NameService;
    }

    public void setNameService(String NameService) {
        this.NameService = NameService;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}
