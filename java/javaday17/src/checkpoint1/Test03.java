package checkpoint1;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File f = new File("C:\\bbb");
        if (!f.exists()) {
            f.mkdir();
        }
        System.out.println(f.getAbsolutePath());
    }
}
