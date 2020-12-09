package com.maggie.servertest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:
 * author:MaggieHao
 * Date:2020-06-09
 * Time:20:58
 */
public class ServerSocketDemo {


    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();//监听客户端连接
            System.out.println(socket.getPort());

            BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(socket.getInputStream())));
            String s = bufferedReader.readLine();
            String clientStr =s; //读取客户端的一行数据
            System.out.println("接收到客户端的信息："+clientStr);
            //写回去
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((socket.getOutputStream())));
            bufferedWriter.write("我收到了信息\n");
            bufferedWriter.flush();




        } catch (IOException e) {
            e.printStackTrace();
        }

    }







}
