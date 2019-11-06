package checkpoint1;

import java.io.*;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        try (FileOutputStream fos = new FileOutputStream("info.txt")) {
            while (true){
                String sc = scr.nextLine();
                if (sc.equals("886")){
                    break;
                }else {

                    fos.write(sc.getBytes());
                    fos.write("\r\n".getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
