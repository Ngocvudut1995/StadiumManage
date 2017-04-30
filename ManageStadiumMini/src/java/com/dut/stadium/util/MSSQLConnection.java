/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author VuDang
 */
public class MSSQLConnection {
    private String DB_NAME;
    private String DB_PORT;
    private String DB_USERNAME;
    private String DB_PASSWORD;

    public MSSQLConnection() {
        this("managestadium", "3306", "root", "");
    }

    public MSSQLConnection(String DB_NAME, String DB_PORT, String DB_USERNAME, String DB_PASSWORD) {
        this.DB_NAME = DB_NAME;
        this.DB_PORT = DB_PORT;
        this.DB_USERNAME = DB_USERNAME;
        this.DB_PASSWORD = DB_PASSWORD;
    }

    public Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connection = "jdbc:mysql://localhost:"+DB_PORT+"/"+DB_NAME+"?useUnicode=true&characterEncoding=UTF-8";
          
             conn = DriverManager.getConnection(connection, DB_USERNAME, DB_PASSWORD);
            //conn = DriverManager.getConnection("jdbc:sqlserver://localhost:" + DB_PORT + ";databaseName=" + DB_NAME + ";user=" + DB_USERNAME + ";password=" + DB_PASSWORD + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean execute(String strQuery) throws SQLException {
        Connection conn = null;
        try {
            conn = getConnection();
            Statement st = conn.createStatement();
            st.execute(strQuery);

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return false;
        } finally {
            conn.close();
        }
        return true;
    }

    public ResultSet query(String strSQL) throws Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            Statement st = conn.createStatement();
            rs = st.executeQuery(strSQL);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        } finally {

        }
        return rs;
    }
}
