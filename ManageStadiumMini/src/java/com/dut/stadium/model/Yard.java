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
public class Yard {
  
	private String IDYard;
	private String NameYard;
	private String TypeYard;
	private String Status;
	private double Price;
	private String Image;
	private String Decription;

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
