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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuDang
 */
public class BillDetail {
     public Bill Bill;
       public Yard Yard;
        public Account AccountStaff;
        public Account AccountCustomer;
        public String TimeSlot;
        public double PriceTotal;
        public List<BillDetail> getAll(){
            MSSQLConnection db = new MSSQLConnection();
            List<BillDetail> list_bill = new ArrayList<>();
            try {
                ResultSet rs = db.query("Select * from bill");
                while(rs.next()){
                    BillDetail bill_detail = new BillDetail();
                    String id;
                    id = rs.getString("IDCustomer");
                    Bill bill = new Bill();
                    bill.setIDBill(rs.getString("IDBill"));
                    //bill_detail.Bill.setIDBill(rs.getString("IDBill"));
                   bill.setIDCustomer(id);
                    bill.setDatePay(rs.getDate("DatePay"));
                  bill.setIDStaff(rs.getString("IDStaff"));
                   bill.setIDTimeSlot(rs.getInt("IDTimeSlot"));
                  bill.setIDYard(rs.getString("IDYard"));
                    bill.setListIDService(rs.getString("ListIDService"));
                    bill.setPriceService(rs.getDouble("PriceService"));
                   bill.setPriceYard(rs.getDouble("PriceYard"));
                  bill.setPromotion(rs.getInt("Promotion"));
                 
                    ResultSet rs_Yard = db.query("Select * from yard where IDYard = '"+rs.getString("IDYard")+"'");
                    Yard yard = new Yard();
                    if(rs_Yard.next()){
                       yard.setIDYard(rs_Yard.getString("IDYard"));
                    yard.setNameYard(rs_Yard.getString("NameYard"));
                    }
                   
                     ResultSet rs_Customer = db.query("Select * from account where IDAccount = '"+rs.getString("IDCustomer")+"'");
                     Account account_customer = new Account();
                     if(rs_Customer.next()){
                         account_customer.setIDAccount(rs_Customer.getString("IDAccount"));
                     account_customer.setNameAccount(rs_Customer.getString("NameAccount"));
                     }
                     
                     ResultSet rs_Staff = db.query("Select * from account where IDAccount = '"+rs.getString("IDStaff")+"'");
                    Account account_staff = new Account();
                     if(rs_Staff.next()){
                        account_staff.setIDAccount(rs_Staff.getString("IDAccount"));
                    account_staff.setNameAccount(rs_Staff.getString("NameAccount"));
                     }
                     ResultSet rs_TimeSlot = db.query("Select * from timeslot where IDTimeSlot = "+rs.getInt("IDTimeSlot"));
                     TimeSlot timeSlot = new TimeSlot();
                     if(rs_TimeSlot.next()){
                        timeSlot.setIDTimeSlot(rs_TimeSlot.getInt("IDTimeSlot"));
                    timeSlot.setTimeSlot(rs_TimeSlot.getString("TimeSlot"));
                     }
                      bill_detail.Bill = bill;
                     bill_detail.Yard = yard;
                     bill_detail.AccountCustomer = account_customer;
                     bill_detail.AccountStaff = account_staff;
                     bill_detail.TimeSlot = timeSlot.getTimeSlot();
                    list_bill.add(bill_detail);
                }
            } catch (Exception ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list_bill;
        }
}
