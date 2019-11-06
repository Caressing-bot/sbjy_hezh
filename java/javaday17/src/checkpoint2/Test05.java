package checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        File file = new File(scr.nextLine());
        File[] files = file.listFiles();
        for (File a : files) {
            a.delete();
        }
        file.delete();
    }
}
