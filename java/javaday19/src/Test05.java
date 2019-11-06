import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file),"GBK")) {
            osw.write("我爱java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
