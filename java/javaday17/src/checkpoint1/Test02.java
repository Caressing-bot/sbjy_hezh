package checkpoint1;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\a.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
    }
}
