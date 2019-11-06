package Test06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket ;
        while (true){
            socket = ss.accept();
            String address = socket.getInetAddress().getHostAddress();
            int port = socket.getPort();
            String client =address +":"+port;

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String len;
            while (null!=(len=br.readLine())){
                System.out.println("来自"+client+"发信息："+len);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write("复读："+len);
                bw.newLine();
                bw.flush();
            }
            br.close();
            socket.close();
        }
    }
    }


