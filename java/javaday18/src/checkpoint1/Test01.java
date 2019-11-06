package checkpoint1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        File  file = new File("a.txt");
        try(FileOutputStream fis = new FileOutputStream(file)) {
            fis.write(97);
            fis.write(98);
            fis.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
