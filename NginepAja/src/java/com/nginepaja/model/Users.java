/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.model;

//import com.mysql.jdbc.*;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Users extends MyConnection {

//    private Connection connect;
//    private Statement stat;
//    private ResultSet result;
    private String username;
    private String password;
    private String pin;
    private String email;

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //</editor-fold>
    public Users() {
        this.getConnection();
    }

    public Users(String username) {
        this.username = username;
        this.getConnection();
    }

    public Users(String username, String password, String pin, String email) {
        this.username = username;
        this.pin = pin;
        this.password = password;
        this.email = email;
        this.getConnection();
    }

    //<editor-fold defaultstate="collapsed" desc="Method">
    public ArrayList<Users> display() {
        ArrayList<Users> temp = new ArrayList<>();
        try {

            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("select * from user");

            while (result.next()) {
                Users u = new Users(result.getString("username"), result.getString("password"), result.getString("pin"), result.getString("email"));
                temp.add(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    //kalo di ppt bapaknya itu ini dibuat void, message nya digenerate dari LoginWS
    public void insert() {
        try {
            stat = (Statement) connect.createStatement();

            if (!connect.isClosed()) {
                PreparedStatement sql = (java.sql.PreparedStatement) connect.prepareStatement("insert into user values(?,?,?,?)");
                sql.setString(1, getUsername());
                sql.setString(2, getPassword());
                sql.setString(3, getPin());
                sql.setString(4, getEmail());

                sql.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("error nya di insert user " + e);
        }

    }

}
