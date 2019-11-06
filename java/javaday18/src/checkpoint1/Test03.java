package checkpoint1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("c.txt");
        byte[] words = "i love you".getBytes();
        try(FileOutputStream fos = new FileOutputStream(file)) {
            for (int i = 0; i < 5; i++) {
                fos.write(words);
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
