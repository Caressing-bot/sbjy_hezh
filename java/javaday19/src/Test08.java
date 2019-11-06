import com.hzh.bean.Student;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("stu.txt");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Student stu = null;
        stu = (Student)in.readObject();
        in.close();
        System.out.println(stu.getName()+stu.getAge()+stu.getSex());
    }
}
