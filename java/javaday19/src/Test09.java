import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        File file = new File("d.txt");
        PrintStream ps = new PrintStream(file);
        System.setOut(ps);
        System.out.println(scr.next());
        ps.close();
    }
}
