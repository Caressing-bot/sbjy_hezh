package checkpoint2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        String src = scr.next();
        File f = new File(src);
        if (!f.exists()) {
            f.createNewFile();
        } else {
            System.out.println(f.length());
        }
    }
}
