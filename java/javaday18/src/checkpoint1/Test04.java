package checkpoint1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        int b;
        try(FileInputStream fis = new FileInputStream(file)) {
            while (-1 != (b = fis.read())){
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
