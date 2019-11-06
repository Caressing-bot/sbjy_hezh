package checkpoint3;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/my/java");
        copyZipFile(file);
    }

    private static void copyZipFile(File dir) throws IOException {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".zip")||pathname.isDirectory();
            }
        });
        for (File f:files) {
            if (f.isFile()){
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream("E:/"+f.getName());
                byte[] bytes = new byte[1024];
                int len;
                while (-1!=(len = fis.read(bytes))){
                    fos.write(bytes);
                }
            }else {
                copyZipFile(f);
            }
        }
    }
}
