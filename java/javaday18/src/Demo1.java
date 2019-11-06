import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        int len;
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[2];
        for (int i = 0; i < file.length(); i++) {
            if (-1==(len = fis.read(b))){
                break;
            }
            System.out.print(new String(b,0,len));
        }
        fis.close();
    }
}
