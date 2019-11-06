import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try(FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bot = new BufferedOutputStream(fos)) {
            bot.write(98);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
