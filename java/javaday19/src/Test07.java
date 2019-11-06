import com.hzh.bean.Student;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student();
        Student s1 = new Student("小明",18,"男");

        File file = new File("stu.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(s1);
        out.writeObject(stu);
        out.close();
        fos.close();
    }
}
