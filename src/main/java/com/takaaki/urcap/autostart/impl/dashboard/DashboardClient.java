package com.takaaki.urcap.autostart.impl.dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DashboardClient {

    private String MESSAGE_HEADER = "Client -> port29999:";

    public static int STOPPED = 1;
    public static int PLAYING = 2;
    public static int PAUSED = 4;
    private String ipAddress;

    public DashboardClient(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void powerOn() {

        sendCommand("power on", false);

    }

    public void brakeRelease() {

        sendCommand("brake release", false);

    }

    public String sendCommand(String command, boolean flag_recieve) {
        try {
            System.out.println(MESSAGE_HEADER + "Connect to Dashboard");

            Socket socket = new Socket(ipAddress, 29999);
            socket.setSoTimeout(1000);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String returnStr = receiveResponse(reader);

            if (socket.isConnected()) {

                System.out.println(MESSAGE_HEADER + "Send \"" + command + "\"");
                writer.println(command);
                writer.flush();
                if (flag_recieve)
                    returnStr = receiveResponse(reader);

            } else
                returnStr = null;

            socket.close();
            reader.close();
            writer.close();

            System.out.println(MESSAGE_HEADER + "Socket Closed");

            return returnStr;

        } catch (Exception e) {
            System.out.println(MESSAGE_HEADER + e.getMessage());
            return null;
        }
    }

    private String receiveResponse(BufferedReader reader) {
        try {

            String response = reader.readLine();
            System.out.println(MESSAGE_HEADER + "Recieved \"" + response + "\"");
            return response;

        } catch (IOException e) {
            System.out.println(MESSAGE_HEADER + e.getMessage());
            return null;
        }
    }
}