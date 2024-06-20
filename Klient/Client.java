package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public void start(String address, int port) {
        try {
            ConnectionThread thread = new ConnectionThread(address, port);
            thread.start();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            while(true) {

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
