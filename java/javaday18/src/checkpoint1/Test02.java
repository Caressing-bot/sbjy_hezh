package checkpoint1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("b.txt");
        try(FileOutputStream fos = new FileOutputStream(file)) {
            byte[] b = "我爱中国".getBytes();
            fos.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
