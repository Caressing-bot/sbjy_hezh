import com.dfbz.bean.tempate.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("集合大小：" + students.size());
        for (Student c : students) {
            System.out.println(c);
        }
        System.out.println("---------");
        for (Student stu : students) {
            if (stu.getHeight() > 1.70) {
                System.out.println(stu);
            }
        }
    }
}
