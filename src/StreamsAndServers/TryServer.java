package StreamsAndServers;// Created by natha on 10/8/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/8/2017
// Filename: TryServer.java
// Project: JavaTrials


// Imports:
import java.io.*;
import java.net.*;

public class TryServer {

    private ServerSocket server;
    private String[] responses = {"You made a connection!", "Hot Diggity", "You've done it this time.", "You deserve a Reese Cup."};

    public TryServer()throws IOException{
        this.server = new ServerSocket(4242);
    }

    public static void main(String[] args){
        try {
            TryServer server = new TryServer();
            server.startServer();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public void startServer() throws IOException {
        while(true){
            Socket socket = server.accept();

            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String response = getResponse();
            writer.println("Client: " + response);
            writer.close();
            System.out.println("Server: " + response);
        }
    }

    private String getResponse() {
        int random = (int)(Math.random() * responses.length);
        return responses[random];
    }

}//end of head class
