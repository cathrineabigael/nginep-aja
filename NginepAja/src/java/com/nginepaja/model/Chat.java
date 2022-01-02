/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Chat extends MyConnection {

    private int chatId;
    private String content;
    private String time;
    private Users user;
    private String usr;
    
    

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }
    
    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Chat() {
        this.getConnection();
    }

    public Chat(String content, String time, String user) {
        this.content = content;
        this.time = time;
        this.usr = user;
        this.getConnection();
    }
    
    public Chat(String content, String time, Users user) {
        this.content = content;
        this.time = time;
        this.user = user;
        this.getConnection();
    }

    public void insert() {

        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement
        ("insert into chat(content, time, username) values(?,?,?)");
                sql.setString(1, content);
                sql.setString(2, time);
                sql.setString(3, usr);
                sql.executeUpdate();

            } else {
                System.out.println("Lost Connection");
            }
        } catch (SQLException ex) {
            System.out.println("Error di insert : " + ex);
        }
    }
}
