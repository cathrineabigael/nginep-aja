///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package server;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
///**
// *
// * @author lauwrentsio
// */
//public class chat extends MyConnection {
//
//
//  
//
//    /**
//     * @return the username
//     */
//    /**
//     * @return the userId
//     */
//    private int id;
//    private String content;
//    private String time_chat;
//    private String username;
//    
//    private int houseid;
//    private int rentDuration;
//    private String userAddress;
//    private String firstname;
//    private String lastname;
//    private String phone;
//    private String status;
//    private String booktime;
//    private String dateStart;
//    
//    public chat(String _content, String _time_chat, String _username) {
//        this.content = _content;
//        this.time_chat = _time_chat;
//        this.username = _username;
//        getConnection();
//    }
//
//    public chat(int _houseid,String _username,String _status,String _dateStart,int _rentDuration,String _bookTime, String _userAddress, String _firstname, String _lastname, String _phone) {
//        this.houseid = _houseid;
//        this.username = _username;
//        this.status = _status;
//        this.dateStart = _dateStart;
//        this.rentDuration = _rentDuration;
//        this.booktime = _bookTime;
//        this.userAddress = _userAddress;
//        this.firstname = _firstname;
//        this.lastname = _lastname;
//        this.phone = _phone;
//        getConnection();
//    }
//      public int getHouseid() {
//        return houseid;
//    }
//
//
//    public void setHouseid(int houseid) {
//        this.houseid = houseid;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getBooktime() {
//        return booktime;
//    }
//
// 
//    public void setBooktime(String booktime) {
//        this.booktime = booktime;
//    }
//    public String getUsername() {
//        return username;
//    }
//
//    /**
//     * @param username the username to set
//     */
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getTime_chat() {
//        return time_chat;
//    }
//
//    public void setTime_chat(String time_chat) {
//        this.time_chat = time_chat;
//    }
//
//    public int getRentDuration() {
//        return rentDuration;
//    }
//
//    public void setRentDuration(int rentDuration) {
//        this.rentDuration = rentDuration;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }
//
//    public void setUserAddress(String userAddress) {
//        this.userAddress = userAddress;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//    public String getDateStart() {
//        return dateStart;
//    }
//    public void setDateStart(String dateStart) {
//        this.dateStart = dateStart;
//    }
//    public void insert() {
//
//        try {
//            if (!connect.isClosed()) {
//                stat = (Statement) connect.createStatement();
//                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("insert into chat(content, time, username) values(?,?,?)");
//                sql.setString(1, getContent());
//                sql.setString(2, getTime_chat());
//                sql.setString(3, getUsername());
//                sql.executeUpdate();
//
//            } else {
//                System.out.println("Lost Connection");
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error di insert : " + ex);
//        }
//    }
//
//    public void insertReservasi() {
//        try {
//            if (!connect.isClosed()) {
//                stat = (Statement) connect.createStatement();
//                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("insert into booking(houseid,"
//                        + "username,status,dateStart,rentDuration, booktime,"
//                        + " userAddress, firstname, lastname, phone) values(?,?,?,?,?,?,?,?,?,?)");
//                sql.setInt(1, getHouseid());
//                sql.setString(2, getUsername());
//                sql.setString(3, getStatus());
//                sql.setString(4, getDateStart());
//                sql.setInt(5, getRentDuration());
//                sql.setString(6, getBooktime());
//                sql.setString(7, getUserAddress());
//                sql.setString(8, getFirstname());
//                sql.setString(9, getLastname());
//                sql.setString(10, getPhone());
//                sql.executeUpdate();
//            } else {
//                System.out.println("Lost Connection");
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error di insertReservasi : " + ex);
//        }
//    }
//    
//    
//}
