import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(file),"GBK");
        int read;
        while (-1!=(read = isr2.read())){
            System.out.print((char)read);
        }
        isr2.close();
    }
}
