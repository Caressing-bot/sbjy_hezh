import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        //FileOutputStream fost = new FileOutputStream("b.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
