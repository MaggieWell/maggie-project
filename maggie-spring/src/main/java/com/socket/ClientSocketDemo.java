package com.socket;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-29
 * Time:21:39
 */
public class ClientSocketDemo {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {

            Socket socket = new Socket("localhost",8080);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            writer.println("hello 静静");

        }catch (Exception e){

        }

    }
}
