package checkpoint2;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File a = new File("E:/aaa");
        printDir(a);
    }
    public static void printDir(File dir){
        File[] files = dir.listFiles();
        for (File f:files) {
            if (f.isFile()){
                System.out.println(f.getAbsolutePath());
            }else {
                System.out.println(f.getAbsolutePath());
                printDir(f);
            }
        }
    }
}
