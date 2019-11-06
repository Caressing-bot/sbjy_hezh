package checkpoint1;

import java.io.File;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\aaa\\b.txt");
        System.out.println(f.getName());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
    }
}
