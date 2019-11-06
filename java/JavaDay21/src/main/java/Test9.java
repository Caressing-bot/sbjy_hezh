import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Test9 {
    public static void main(String[] args) throws Exception {
        File file = new File("test9.properties");
        if (!file.exists()) {
            file.createNewFile();
        }
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        String count = properties.getProperty("count");
        if (null != count) {
            int i = Integer.parseInt(count);
            if (i >= 3) {
                System.out.println("程序使用次数已满，请续费");
                return;
            }
            i += 1;
            properties.setProperty("count", "" + i);
        } else {
            properties.setProperty("count", "0");
        }
        FileOutputStream fos = new FileOutputStream(file);
        properties.store(fos, "");
    }
}