package checkpoint2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        try(FileInputStream fis = new FileInputStream("score.txt");FileOutputStream fos = new FileOutputStream("score.txt")) {
            pro.load(fis);
            Set<String> strings = pro.stringPropertyNames();
            for (String s:strings) {
                if (s.equals("lisi")){
                    pro.replace(s,100);
                }
            }
            pro.store(fos,"=");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
