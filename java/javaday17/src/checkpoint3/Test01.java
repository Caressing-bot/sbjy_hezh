package checkpoint3;

import java.io.File;
import java.io.FileFilter;

public class Test01 {
    public static void main(String[] args) {
        File dir = new File("D:/aaa");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                for (File f : dir.listFiles()) {
                    if ((f.length() / 1024) < 200) {
                        System.out.println(f.getAbsolutePath());
                    } else {
                        accept(f);
                    }
                }
                return false;
            }
        };
        fileFilter.accept(dir);
    }
}
