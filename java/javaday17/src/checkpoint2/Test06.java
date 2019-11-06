package checkpoint2;

import java.io.File;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        file.mkdir();
        calculate(file);
    }

    public static long calculate(File file) {
        long size = 0L;
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                size += f.length();
            } else {
                calculate(f);
            }
        }
        return size;
    }
}
