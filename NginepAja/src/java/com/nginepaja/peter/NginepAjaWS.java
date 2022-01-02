/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nginepaja.peter;

import com.nginepaja.model.Users;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "NginepAjaWS")
public class NginepAjaWS {

    ArrayList<Users> listOfUser = new ArrayList<Users>();
    Users model;

    public NginepAjaWS() {
        model = new Users();
        listOfUser = model.display();
    }

//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "cekLogin")
    public String cekLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        String status = "";
        for (Users u : listOfUser) {
            String uname = u.getUsername();
            String pwd = u.getPassword();

            if (username.equals(uname) && password.equals(pwd)) { //apakah inputan username sama dengan data listOfUser?
                status = "CONNECT";
                break;
            } else {
                status = "FAILED";
            }
        }

        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "pin") String pin, @WebParam(name = "email") String email) {
        String status = "";
        for (Users u : listOfUser) {
            String uname = u.getUsername();
            System.out.println(uname);
            String mail = u.getEmail();

            if (username.equals(uname)) {
                status = "uname";
                break;
            } else if (email.equals(mail)) {
                status = "email";
                break;
            } else {
                status = "sukses";
                model = new Users(username, password, pin, email);
                model.insert();
            }
        }
        return status;
    }

     public boolean cekPin(@WebParam(name = "username") String username, @WebParam(name = "pin") String pin) {
        //TODO write your implementation code here:
        boolean status = false;
        for (Users u : listOfUser) {
            String p = u.getPin();
            String usr = u.getUsername();

            if (username.equals(usr)) {
                if (pin.equals(p)) {
                    status = true;
                    break;
                } else {
                    status = false;
                }
            }
        }
        return status;
    }

}
