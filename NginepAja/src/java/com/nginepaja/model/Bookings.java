/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.model;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Bookings extends MyConnection {

    private int bookingId;

    private Houses house;
    private Users user;

    private int id;
    private String username;
    private String status;
    private String dateStart;
    private int rentDuration;
    private String bookTime;
    private String userAddress;
    private String firstName;
    private String lastName;
    private String phone;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Houses getHouse() {
        return house;
    }

    public void setHouse(Houses house) {
        this.house = house;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Bookings() {
        this.getConnection();
    }
    
    public Bookings(int houseId, String user, String status,String dateStart, int rentDuration, 
            String bookTime, String userAddress, String firstName, String lastName, String phone) {
        this.id = houseId;
        this.username = user;
        this.status = status;
        this.dateStart = dateStart;
        this.rentDuration = rentDuration;
        this.bookTime = bookTime;
        this.userAddress = userAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.getConnection();
    }

//     public Bookings(int bookingId, int houseId, Users user, String status,
//            String dateStart, int rentDuration, String bookTime, String userAddress, String firstName, String lastName, String phone) {
//        this.bookingId = bookingId;
//        this.house = house;
//        this.user = user;
//        this.status = status;
//        this.dateStart = dateStart;
//        this.rentDuration = rentDuration;
//        this.bookTime = bookTime;
//        this.userAddress = userAddress;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phone = phone;
//        this.getConnection();
//    }

    
    //dengan bookingId
    public Bookings(int bookingId, Houses house, Users user, String status,
            String dateStart, int rentDuration, String bookTime, String userAddress, String firstName, String lastName, String phone) {
        this.bookingId = bookingId;
        this.house = house;
        this.user = user;
        this.status = status;
        this.dateStart = dateStart;
        this.rentDuration = rentDuration;
        this.bookTime = bookTime;
        this.userAddress = userAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.getConnection();
    }

    //tanpa bookingId
    public Bookings(Houses house, Users user, String status, String dateStart,
            int rentDuration, String bookTime, String userAddress, String firstName, String lastName, String phone) {
        this.house = house;
        this.user = user;
        this.status = status;
        this.dateStart = dateStart;
        this.rentDuration = rentDuration;
        this.bookTime = bookTime;
        this.userAddress = userAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public void insert() {
        try {
            stat = (Statement) connect.createStatement();
            if (!connect.isClosed()) {
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("insert into booking "
                        + "(houseId,username,status,dateStart,rentDuration,"
                        + "bookTime,userAddress,firstName,lastName,phone) values(?,?,?,?,?,?,?,?,?,?) ");
                sql.setInt(1, id);
                sql.setString(2, username);
                sql.setString(3, status);
                sql.setString(4, dateStart);
                sql.setInt(5, rentDuration);
                sql.setString(6, bookTime);
                sql.setString(7, userAddress);
                sql.setString(8, firstName);
                sql.setString(9, lastName);
                sql.setString(10, phone);
                sql.executeUpdate();
                this.getConnection();
            } else {
                System.out.println("Lost Connection");
            }
        } catch (Exception ex) {
            System.out.println("Error di insertReservasi : " + ex);
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Bookings> display() {
        ArrayList<Bookings> temp = new ArrayList<>();
        try {

            stat = (java.sql.Statement) connect.createStatement();
            result = stat.executeQuery("select * from booking");

            while (result.next()) {
                Users u = new Users(result.getString("username"));
                Houses h = new Houses(result.getInt("houseId"));
                Bookings b = new Bookings(house, user, result.getString("status"),
                        result.getString("dateStart"), result.getInt("rentDuration"),
                        result.getString("bookTime"), result.getString("userAddress"),
                        result.getString("firstName"), result.getString("lastName"), result.getString("phone"));
                temp.add(b);
            }
        } catch (Exception ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    public ArrayList<Bookings> displayData(String username) {
        ArrayList<Bookings> temp = new ArrayList<>();
        try {

            stat = (java.sql.Statement) connect.createStatement();
            result = stat.executeQuery("select * from booking b inner join house h on b.houseid = h.houseid where username = '" + username+"'");

            while (result.next()) {
                Users u = new Users(result.getString("username"));
                Houses h = new Houses(result.getInt("houseId"),result.getString("address"), result.getInt("pricePerYear"),result.getInt("bathroom"),result.getInt("bedroom"),result.getInt("electricalPower"));
                Bookings b = new Bookings(result.getInt("bookingid"),h, u,result.getString("status"),
                        result.getString("dateStart"), result.getInt("rentDuration"),
                        result.getString("bookTime"), result.getString("userAddress"),
                        result.getString("firstName"), result.getString("lastName"), result.getString("phone"));
                temp.add(b);
            }
        } catch (Exception ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
