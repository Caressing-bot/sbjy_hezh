package Test06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        Scanner scr = new Scanner(System.in);
        while (true){
            String s = scr.next();
            if ("exit".equals(s)){
                break;
            }
            bw.write(s);
            bw.newLine();
            bw.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = br.readLine();
            System.out.println(line);
        }
        bw.close();
        client.close();
    }

}
