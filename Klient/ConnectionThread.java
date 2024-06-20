package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.Socket;

public class ConnectionThread extends Thread{
    Socket socket;
    PrintWriter writer;

    public ConnectionThread(String address, int port) throws IOException {
        this.socket = new Socket(address, port);
    }

    public void run() {
        try {
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(input)
            );
            this.writer = new PrintWriter(output, true);

            String rawMessage;

            while((rawMessage = reader.readLine()) != null) {

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
