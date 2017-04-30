/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.util.MSSQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Logger;

/**
 *
 * @author VuDang
 */
public class AccountStaff {
    public Account account;
    private String Position;
    private double Salary;
    public List<AccountStaff> getAll(){
        MSSQLConnection db = new MSSQLConnection();
        List<AccountStaff> list_account = new ArrayList<>();
        try {
            ResultSet rs = db.query("Select * from staff");
            while (rs.next()) {
                AccountStaff accountStaff = new AccountStaff();
                accountStaff.Position = rs.getString("Position");
                accountStaff.Salary = rs.getDouble("Salary");
                
                ResultSet rs_account = db.query("Select * from account where IDAccount = '"+rs.getString("IDStaff")+"'");
               
                if(rs_account.next()){
                    Account account = new Account();
                   account.setAddress(rs_account.getString("Address"));
                    account.setBirthday(rs_account.getDate("Birthday"));
                    account.setCreatedDay(rs_account.getDate("CreatedDay"));
                   account.setEmail(rs_account.getString("Email"));
                   account.setIDAccount(rs_account.getString("IDAccount"));
                    account.setIdentification(rs_account.getString("Identification"));
                    account.setNameAccount(rs_account.getString("NameAccount"));
                    account.setPhone(rs_account.getString("Phone"));
                    accountStaff.account = account;
                }
                list_account.add(accountStaff);
            }

        } catch (Exception ex) {

        }
        return list_account;
    }
    public AccountStaff getByID(String id){
        MSSQLConnection db = new MSSQLConnection();
      
        try {
            ResultSet rs = db.query("Select * from staff");
               AccountStaff accountStaff = new AccountStaff();
            if(rs.next()) {
             
                accountStaff.Position = rs.getString("Position");
                accountStaff.Salary = rs.getDouble("Salary");
                
                ResultSet rs_account = db.query("Select * from account where IDAccount = '"+rs.getString("IDStaff")+"'");
               
                if(rs_account.next()){
                    Account account = new Account();
                   account.setAddress(rs_account.getString("Address"));
                    account.setBirthday(rs_account.getDate("Birthday"));
                    account.setCreatedDay(rs_account.getDate("CreatedDay"));
                   account.setEmail(rs_account.getString("Email"));
                   account.setIDAccount(rs_account.getString("IDAccount"));
                    account.setIdentification(rs_account.getString("Identification"));
                    account.setNameAccount(rs_account.getString("NameAccount"));
                    account.setPhone(rs_account.getString("Phone"));
                    accountStaff.account = account;
                }
               
            }
            return accountStaff;

        } catch (Exception ex) {

        }
        return null;
    }
      public boolean update(){
      MSSQLConnection db = new MSSQLConnection();
        try {
            if(db.execute("Update staff set Position = '"+Position+"', Salary = "+Salary+" where IDStaff = '"+account.getIDAccount()+"'")){
             SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
                return db.execute("Update account set Address = '"+account.getAddress()+"',NameAccount = N'"+account.getNameAccount()+"',"
                        + "Birthday = '"+sdfr.format(account.getBirthday())+"',Email = '"+account.getEmail()+"',"
                        + "Identification = '"+account.getIdentification()+"',Phone = '"+account.getPhone()+"' where "
                                + "IDAccount = '"+account.getIDAccount()+"'");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      return false;
  }
         public boolean add(){
      MSSQLConnection db = new MSSQLConnection();
        try {
            SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
            if(db.execute("INSERT INTO account (IDAccount,NameAccount,Email, "
                    + "Password, Birthday, Phone, Address, Identification, "
                    + "CreatedDay) VALUES ('"+account.getIDAccount()+"', '"+account.getNameAccount()+"', '"+account.getEmail()+"',"
                    + " '"+account.getPassword()+"','"+sdfr.format(account.getBirthday())+"', '"+account.getPhone()+"',"
                            + " '"+account.getAddress()+"','"+account.getIdentification()+"',"
                                    + " '"+sdfr.format(new Date())+"');")){
             
                return db.execute("INSERT INTO staff (IDCustomer, Position,Salary) "
                        + "VALUES ('"+account.getIDAccount()+"', '"+Position+"',"+Salary+")");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      return false;
  }
    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
}
