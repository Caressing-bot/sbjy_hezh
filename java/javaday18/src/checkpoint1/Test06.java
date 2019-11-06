package checkpoint1;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        int len;
        try(FileInputStream fis = new FileInputStream("a.jpg"); FileOutputStream fos = new FileOutputStream("a1.jpg")) {

            while (-1!=(len = fis.read())){
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
