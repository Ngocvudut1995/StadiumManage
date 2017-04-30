/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.model;

import com.dut.stadium.util.MSSQLConnection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuDang
 */
public class BookYard {
    
	private int IDBook;
	private Date DateBook;
	private String IDCustomer;
	private int Status;
	private String Contents;
	private String IDYard ;
	private int IDTimeSlot;
        private String ListIDService;
           public boolean add(){
      MSSQLConnection db = new MSSQLConnection();
        try {
            SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
            return db.execute("INSERT INTO bookyard "
                    + "(IDBook, DateBook, IDCustomer, "
                    + "Status, Contents, IDYard, IDTimeSlot, "
                    + "ListIDService)"
                    + " VALUES (NULL, '"+sdfr.format(DateBook)+"', '"+IDCustomer+"', '"+Status+"', '"+Contents+"',"
                            + " '"+IDYard+"', '"+IDTimeSlot+"', '"+ListIDService+"')");
             
           
        } catch (SQLException ex) {
            Logger.getLogger(AccountCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      return false;
  }
    public int getIDBook() {
        return IDBook;
    }

    public void setIDBook(int IDBook) {
        this.IDBook = IDBook;
    }

    public Date getDateBook() {
        return DateBook;
    }

    public void setDateBook(Date DateBook) {
        this.DateBook = DateBook;
    }

    public String getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(String IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public int isStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String Contents) {
        this.Contents = Contents;
    }

    public String getIDYard() {
        return IDYard;
    }

    public void setIDYard(String IDYard) {
        this.IDYard = IDYard;
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
	
}
