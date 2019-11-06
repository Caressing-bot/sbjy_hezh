package checkpoint1;

import java.io.File;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\a.txt");
        f.createNewFile();
        f.delete();
        File f1 = new File("C:\\aaa");
        if (!f1.exists()) {
            f1.mkdir();
        }
        f1.delete();
    }
}
