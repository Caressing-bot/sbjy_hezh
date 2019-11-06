package checkpoint1;

import java.io.File;

public class Test07 {
    public static void main(String[] args) {
        File f = new File("E:\\aaa\\a.txt");
        File f1 = new File("E:\\aaa");
        if (f.isFile()){
            System.out.println(f.getName()+"是一个文件");
        }else {
            System.out.println(f.getName()+"不是一个文件");
        }
        if (f1.isDirectory()){
            System.out.println(f1.getName()+"是一个文件夹");
        }else {
            System.out.println(f1.getName()+"不是一个文件夹");
        }
    }
}
