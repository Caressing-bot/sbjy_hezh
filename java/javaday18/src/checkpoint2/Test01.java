package checkpoint2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        try(FileOutputStream fos = new FileOutputStream("stu.txt")) {
            while (true){
                System.out.println("请以学号-学生名字格式输入学生信息：");
                String s = scr.nextLine();
               if (s.equals("end")){
                   break;
               }else {
                   fos.write(s.getBytes());
                   fos.write("\r\n".getBytes());
               }
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
