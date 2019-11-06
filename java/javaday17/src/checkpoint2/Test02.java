package checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        File f = new File(scr.next());
        int b = 0;
        if (f.isFile()) {
            System.out.println(f.length());
        }
        if (f.isDirectory()) {
            File[] name = f.listFiles();
            for (File a : name) {
                b += a.length();

            }
            System.out.println(b);
        }
    }
}
