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
public class AccountCustomer {
    public Account account;
    private int Level;
  public List<AccountCustomer> getAll(){
        MSSQLConnection db = new MSSQLConnection();
        List<AccountCustomer> list_account = new ArrayList<>();
        try {
            ResultSet rs = db.query("Select * from customer");
            while (rs.next()) {
                AccountCustomer accountCustomer = new AccountCustomer();
                accountCustomer.Level = rs.getInt("Level");
              
                ResultSet rs_account = db.query("Select * from account where IDAccount = '"+rs.getString("IDCustomer")+"'");
               
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
                    accountCustomer.account = account;
                }
                list_account.add(accountCustomer);
            }

        } catch (Exception ex) {

        }
        return list_account;
    }
  public AccountCustomer getByID(String id){
        MSSQLConnection db = new MSSQLConnection();
      
        try {
            ResultSet rs = db.query("Select * from customer");
               AccountCustomer accountCustomer = new AccountCustomer();
            if(rs.next()) {
             
               
                accountCustomer.Level = rs.getInt("Level");
                
                ResultSet rs_account = db.query("Select * from account where IDAccount = '"+rs.getString("IDCustomer")+"'");
               
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
                    accountCustomer.account = account;
                }
               
            }
            return accountCustomer;

        } catch (Exception ex) {

        }
        return null;
  }
    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }
}
