import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("a.jpg");
        File file1 = new File("a1.jpg");
        try(FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bit = new BufferedInputStream(fis);
            FileOutputStream fot = new FileOutputStream(file1);
            BufferedOutputStream bot = new BufferedOutputStream(fot)) {
            byte[] bytes = new byte[1024];
            int len;
            while (-1 != (len = bit.read(bytes))){
                bot.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
