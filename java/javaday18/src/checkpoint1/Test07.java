package checkpoint1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) {
        int len;
        byte[] b = new byte[1024];
        try (FileOutputStream fos = new FileOutputStream("a2.jpg"); FileInputStream fis = new FileInputStream("a.jpg")) {
            while (-1!=(len = fis.read(b))){
                fos.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
