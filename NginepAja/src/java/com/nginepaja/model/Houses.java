/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.model;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Houses extends MyConnection {

    private int houseId;
    private String address;
    private int pricePerYear;
    private int bathroom; //jumlah toilet
    private int bedroom; //jumlah kamar
    private int electricalPower; //daya listrik

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPricePerYear() {
        return pricePerYear;
    }

    public void setPricePerYear(int pricePerYear) {
        this.pricePerYear = pricePerYear;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getElectricalPower() {
        return electricalPower;
    }

    public void setElectricalPower(int electricalPower) {
        this.electricalPower = electricalPower;
    }

    public Houses() {
        this.getConnection();
    }

    public Houses(int houseId) {
        this.getConnection();
        this.houseId = houseId;
    }

    public Houses(int houseId, String address, int pricePerYear, int bathroom, int bedroom, int electricalPower) {
        this.houseId = houseId;
        this.address = address;
        this.pricePerYear = pricePerYear;
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.electricalPower = electricalPower;
        this.getConnection();
    }

    public Houses(String address, int pricePerYear, int bathroom, int bedroom, int electricalPower) {
        this.address = address;
        this.pricePerYear = pricePerYear;
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.electricalPower = electricalPower;
        this.getConnection();
    }

    public ArrayList<Houses> display() {
        ArrayList<Houses> temp = new ArrayList<>();
        try {

            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("select * from house");

            while (result.next()) {
                Houses u = new Houses(result.getInt("houseid"), result.getString("address"), result.getInt("pricePerYear"), result.getInt("bathroom"), result.getInt("bedroom"), result.getInt("electricalPower"));
                temp.add(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    public ArrayList<Houses> displayData(int id) {
        ArrayList<Houses> temp = new ArrayList<>();
        try {

            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("select * from house where houseId = " + id);

            while (result.next()) {
                Houses u = new Houses(result.getInt("houseid"), result.getString("address"), result.getInt("pricePerYear"), result.getInt("bathroom"), result.getInt("bedroom"), result.getInt("electricalPower"));
                temp.add(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
