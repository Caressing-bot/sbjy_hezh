package checkpoint1;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        String pathname = "aaa.txt";
        File file = new File(pathname);
        System.out.println(file.getAbsolutePath());

        File file1 = new File("E:\\my\\java", "aaa.txt");
        System.out.println(file1.getAbsolutePath());
    }
}
