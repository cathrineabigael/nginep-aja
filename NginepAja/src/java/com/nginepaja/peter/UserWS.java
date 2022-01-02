/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.peter;

import com.nginepaja.model.Bookings;
import com.nginepaja.model.Chat;
import com.nginepaja.model.Users;
import com.nginepaja.model.Houses;
import java.text.ParseException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "UserWS")
public class UserWS {

    Users model;
    Bookings booking;
    Houses house;
    Chat chat;

    ArrayList<Users> listOfUser = new ArrayList<Users>();
    ArrayList<Bookings> listOfBooking = new ArrayList<Bookings>();
    ArrayList<Houses> listOfHouse = new ArrayList<Houses>();

//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
    public UserWS() {
        model = new Users();
        listOfUser = model.display();

        booking = new Bookings();
        listOfBooking = booking.display();

        house = new Houses();
        listOfHouse = house.display();

        chat = new Chat();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showHouses")
    public ArrayList<Houses> showHouses() {
        house = new Houses();
        return house.display();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showBooking")
    public ArrayList<Bookings> showBooking(@WebParam(name = "username") String username) {
        Bookings booking = new Bookings();
//        ArrayList<Bookings> listOfBooking2 = new ArrayList<Bookings>();
        listOfBooking = booking.displayData(username);
//        ArrayList<Bookings> res = new ArrayList<Bookings>();
//        for (Bookings b : listOfBooking) {
//            if (b.getUsername().equals(username)) {
//           
//                Bookings book = new Bookings(b.getHouse().getHouseId(), b.getUser().getUsername(), b.getStatus(), b.getDateStart(), b.getRentDuration(), b.getBookTime(), b.getUserAddress(), b.getFirstName(), b.getLastName(), b.getPhone());
//                res.add(book);
//            }
//        }

        return listOfBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "book")
    public String book(
            @WebParam(name = "houseId") int houseId,
            @WebParam(name = "username") String username,
            @WebParam(name = "status") String status,
            @WebParam(name = "dateStart") String dateStart,
            @WebParam(name = "rentDuration") int rentDuration,
            @WebParam(name = "booktime") String booktime,
            @WebParam(name = "userAddress") String userAddress,
            @WebParam(name = "firstName") String firstName,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "telephone") String telephone) {
        String notif = "belum";

        
        Bookings booking = new Bookings(houseId,username,status,dateStart,rentDuration,booktime,userAddress,firstName,lastName,telephone);

//        boolean cekPin = user.pin(pin);
//        if (cekPin) {
//        for (Bookings b : listOfBooking) {
//            //dari listOfBooking
//            String dateMulai = b.getDateStart();
//            System.out.println(dateMulai);
//            String dateMulai2 = dateStart.replace("/", "-");
//            System.out.println(dateMulai2);
//            int lamaSewa = b.getRentDuration(); //in month
//            LocalDate startDate = LocalDate.parse(dateMulai2);
//            LocalDate endDate = startDate.plusMonths(lamaSewa);
//            System.out.println(endDate);
//            //inputan usernya
//            String dateStart2 = dateStart.replace("/", "-");
//            System.out.println(dateStart2);
//            LocalDate startDate2 = LocalDate.parse(dateStart2);
//            LocalDate endDate2 = startDate2.plusMonths(rentDuration);
//            System.out.println(endDate);
//            //cek tanggal
//            //kalo data tanggal inputannya itu sama dengan data dr db
//            if (startDate2.compareTo(startDate) == 0) {
//                notif = "gagal1";
//
//            }//kalo data tanggal inputannya sebelumnya data dr db
//            else if (startDate2.compareTo(startDate) < 0) {
//                //cek apakah endDate2 nya itu sebelum startDate
//                if (endDate2.compareTo(startDate) < 0) {
//                    //okee bisa
//
//                    booking.insert();
//                    notif = "bisa1";
//                }
//                notif = "gagal2";
//            } //kalo data tanggal inputannya sesudahnya data dr db, maka cek juga apakah tanggal inputannya itu
//            //setelah endDate nya yg dr db
//            else if (startDate2.compareTo(startDate) < 0 && startDate2.compareTo(endDate) < 0) {
//                //okee bisa
//                booking.insert();
//                notif = "bisa2";
//
//            } else {
//
//                booking.insert();
//                notif = "bisa3";
//
//            }
//
//        }
//        } else {
//            notif = "PIN is wrong";
//        }
        booking.insert();
        notif = "berhasil";
        return notif;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertChat")
    public String insertChat(@WebParam(name = "content") String content, @WebParam(name = "time") String time, @WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        String status = "";
        String cnt = content;
        String waktu = time;
        String usr = username;
        Chat c = new Chat(cnt, waktu, usr);

        c.insert();
        return status;
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "insertRes")
//    public void insertRes(@WebParam(name = "houseId") int houseId, @WebParam(name = "username") String username, @WebParam(name = "status") String status, @WebParam(name = "dateStart") String dateStart, @WebParam(name = "tahunSewa") int tahunSewa, @WebParam(name = "dateTime") String dateTime, @WebParam(name = "alamat") String alamat, @WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName, @WebParam(name = "telepon") String telepon) {
//        //TODO write your implementation code here:
//
//        int rumah = houseId;
//        String usr = username;
//        String s = status;
//        String dS = dateStart;
//        int tS = tahunSewa;
//        String dT = dateTime;
//        String al = alamat;
//        String lN = lastName;
//        String fN = firstName;
//        String tlp = telepon;
//        Bookings b = new Bookings(rumah, usr, s, dS, tS, dT, al, fN, lN, tlp);
//        b.insert();
//
//    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "showHouse")
    public ArrayList<Houses> showHouse(@WebParam(name = "houseId") int houseId) {
        ArrayList<Houses> res = new ArrayList<Houses>();
        for (Houses h : listOfHouse) {
            if (houseId == (h.getHouseId())) {
                Houses rumah = new Houses(h.getHouseId(), h.getAddress(), h.getPricePerYear(), h.getBathroom(), h.getBedroom(), h.getElectricalPower());
                res.add(rumah);
            }
        }
        return res;

//        house = new Houses();
//        return house.displayData();
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "cekPin")
//    public boolean cekPin(@WebParam(name = "username") String username, @WebParam(name = "pin") String pin) {
//        //TODO write your implementation code here:
//        boolean status = false;
//        Users temp = new Users(username);
//        status=temp.pin(pin);
//        return status;
//    }
}
