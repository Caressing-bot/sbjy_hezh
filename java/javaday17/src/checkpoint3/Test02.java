package checkpoint3;

import java.io.File;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入要删除的文件夹路径:");
        File file = new File(scr.nextLine());
        Del(file);
    }

    public static void Del(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                f.delete();
            } else {
                Del(f);
            }
        }
        file.delete();
    }
}
