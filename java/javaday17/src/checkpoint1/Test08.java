package checkpoint1;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        File f = new File("E:/aaa");
        File[] files = f.listFiles();
        for (File a : files) {
            System.out.println(a.getName());
        }
    }

}
