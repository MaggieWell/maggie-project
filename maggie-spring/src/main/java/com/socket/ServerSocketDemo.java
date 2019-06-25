package com.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.System.*;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-29
 * Time:21:39
 */
public class ServerSocketDemo {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            //服务端一定需要去监听一个端口号，ip默认就是本机的ip地址
            serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();//接受客户端的连接（阻塞）

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //输出流
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            //通过控制台拿到数据
//            BufferedReader sin = new BufferedReader(new InputStreamReader(new InputStreamReader()));

            System.out.println(in.readLine());//忽的客户端的输入信息

        }catch (Exception e){

        }

    }
}
