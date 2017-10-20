package StreamsAndServers;// Created by natha on 10/20/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/20/2017
// Filename: SimpleServer.java
// Project: JavaTrials


// Imports:
import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {

    // Attributes:
    ArrayList clientOutputStreams;


// Methods:
    public static void main(String[] args) {
        new SimpleServer().go();
    }


    public void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(5000);

            while(true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("Connection Established.");
            }
        } catch(Exception ex) { ex.printStackTrace();}
    }


    public void tellEveryone(String message) {
        Iterator it = clientOutputStreams.iterator();
        while(it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch(Exception ex) {ex.printStackTrace();}
        }
    }


// Inner Classes:
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;


        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }






}//end of head class
