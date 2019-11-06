package checkpoint2;

import java.io.File;
import java.io.FileFilter;

public class Test04 {
    public static void main(String[] args) {
        File f = new File("E:/aaa");
        Print print = new Print();
        File[] files = f.listFiles();
        for (File a : files) {
            print.accept(a);
        }
        Print print1 = new Print();
        print1.accept(f);
    }

    public static class Print implements FileFilter {

        @Override
        public boolean accept(File pathname) {
            if (pathname.getName().endsWith(".java")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
