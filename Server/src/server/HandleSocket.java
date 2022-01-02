/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author lauwrentsio
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandleSocket extends Thread {
    chatServer parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;


    public HandleSocket(chatServer _parent, Socket _client) {
        try {
            this.parent = _parent;
            this.client = _client;
            out = new DataOutputStream(client.getOutputStream());
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (Exception ex) {
            System.out.println("error di hs constructor = " + ex);
        }
    }
    public void run() {
        sendChat("Welcome");
        while (true) {
            try {
                String msg = in.readLine();//pesan masuk dari client;
                System.out.println("masuk" + msg);
                if(msg.contains(";-joins")){
                    parent.broadcastJoin(this,msg);
                }
                else if(msg.contains("Reservasi")){
                    sendChat("Ketik dengan format untuk reservasi:");
                    sendChat("$Kode:idrumah:tanggalMulaisewa:jumlahBulanSewa:alamat:NamaDepan:NamaBelakang:telepon");
                }
                else{
                    parent.showChat(msg);
                }
                
            } catch (IOException ex) {
                System.out.println("error hs run = "+ex);
            }
        }
    }
    
    
    void sendChat(String msg) {
         try {
            out.writeBytes(msg + "\n");
        } catch (IOException ex) {
            System.out.println("error hs sendChat = "+ex);
        }
    }
}
