///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package server;
//
///**
// *
// * @author lauwrentsio
// */
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class MyConnection {
//    Connection connect;
//    ResultSet result;
//    Statement stat;
//    
//    public Connection getConnection(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            connect = DriverManager.getConnection("jdbc:mysql://localhost/uas_disprog", "root", "");
//        }catch(Exception ex){
//           System.out.println("error getConnection : " + ex);
//        }
//        return connect;
//                
//    }
//}
