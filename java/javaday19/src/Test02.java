import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try(FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bot = new BufferedOutputStream(fos)) {
            byte[] value = "i love you".getBytes();
            bot.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
