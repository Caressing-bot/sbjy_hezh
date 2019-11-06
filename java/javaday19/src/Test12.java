import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("a.txt");
        Files.copy(p,Paths.get("b.txt"));

        BufferedReader bis = new BufferedReader(new FileReader("b.txt"));
        String len;
        while (null!=(len = bis.readLine())){
            System.out.println(len);
        }
        bis.close();
    }
}
