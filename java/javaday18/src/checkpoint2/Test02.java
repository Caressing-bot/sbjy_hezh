package checkpoint2;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("E:\\my\\java\\d1");
        File[] files = file.listFiles();
        File url = new File("E:\\my\\java\\d2");
        url.mkdir();
        for (File f :files) {
            File file1 = new File("E:\\my\\java\\d2"+ f.getName());
            try(FileOutputStream fos = new FileOutputStream(file1); FileInputStream fis = new FileInputStream(f)) {
                byte[] bytes = new byte[100];
                while (-1 !=(fis.read(bytes))){
                    fos.write(bytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
