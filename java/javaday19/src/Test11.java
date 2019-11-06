import com.hzh.bean.Student;

import java.io.*;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("小明",18,"男");
        Student s2 = new Student("小芳",19,"女");
        Student s3 = new Student("小张",20,"男");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        File file = new File("stu.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(list);
        out.close();
        fos.close();
    }
}
