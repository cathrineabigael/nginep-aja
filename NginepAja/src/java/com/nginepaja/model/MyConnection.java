/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class MyConnection {

    Connection connect;
    Statement stat;
    ResultSet result;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.
                    getConnection("jdbc:mysql://localhost/uas_disprog", "root", "");
        } catch (Exception e) {
            System.out.println("errornya : " + e);
        }

        return connect;
    }
}
