package StreamsAndServers;// Created by natha on 10/7/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/7/2017
// Filename: TryStream.java
// Project: JavaTrials


// Imports:
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TryStream {

// Attributes:
    Socket chatSocket;
    InputStreamReader stream;
    BufferedReader reader;
    PrintWriter writer;


// Constructors:
    public TryStream() throws IOException {
        this.chatSocket = new Socket("127.0.0.1", 4242);
        this.stream = new InputStreamReader(this.chatSocket.getInputStream());
        this.reader = new BufferedReader(this.stream);
        this.writer = new PrintWriter(this.chatSocket.getOutputStream());
    }

    public static void main(String[] args) {
        try {
            TryStream client = new TryStream();
            String line = client.getLine();
            System.out.println(line);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getLine() throws IOException {
        return this.reader.readLine();
    }

    public void writeLine(String line) throws IOException {
        this.writer.println(line);
    }

}//end of head class
