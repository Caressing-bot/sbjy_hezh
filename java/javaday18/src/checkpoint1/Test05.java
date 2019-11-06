package checkpoint1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) {
        File file  = new File("b.txt");
        byte[] b = new byte[1024];
        int len;
        try( FileInputStream fis = new FileInputStream(file)) {
           while (-1 !=(len = fis.read(b))){
               System.out.println(new String(b,0,len));
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
