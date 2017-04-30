/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.util.MSSQLConnection;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author VuDang
 */
public class Account {

    private String IDAccount;
	private String NameAccount;
	private String Email;
	private String Password;
	private Date Birthday;
	private String Phone;
         public Account getByID(String id){
        MSSQLConnection db = new MSSQLConnection();
       Account account = new Account();
        try {
                ResultSet rs_account = db.query("Select * from account where IDAccount = '"+id+"'");
                if(rs_account.next()){
                   
                   account.setAddress(rs_account.getString("Address"));
                    account.setBirthday(rs_account.getDate("Birthday"));
                    account.setCreatedDay(rs_account.getDate("CreatedDay"));
                   account.setEmail(rs_account.getString("Email"));
                   account.setIDAccount(rs_account.getString("IDAccount"));
                    account.setIdentification(rs_account.getString("Identification"));
                    account.setNameAccount(rs_account.getString("NameAccount"));
                    account.setPhone(rs_account.getString("Phone"));
                }
               
           return account;

        } catch (Exception ex) {

        }
        return null;
  }
    public String getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(String IDAccount) {
        this.IDAccount = IDAccount;
    }

    public String getNameAccount() {
        return NameAccount;
    }

    public void setNameAccount(String NameAccount) {
        this.NameAccount = NameAccount;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    public Date getCreatedDay() {
        return CreatedDay;
    }

    public void setCreatedDay(Date CreatedDay) {
        this.CreatedDay = CreatedDay;
    }
	private String Address;
	private String Identification;
	private Date CreatedDay;
}
