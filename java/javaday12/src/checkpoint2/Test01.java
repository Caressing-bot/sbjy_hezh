package checkpoint2;

import checkpoint2.sever.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("小明", 90, 17);
        Student s2 = new Student("小红", 60, 18);
        Student s3 = new Student("小黄", 80, 19);
        Student s4 = new Student("小蓝", 95, 17);
        Student s5 = new Student("小青", 85, 18);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        int count = 0;
        int max = 0;
        int down = 100;
        int num = 0;

        Iterator<Student> s = students.iterator();
        while (s.hasNext()) {
            Student student = s.next();
            count += student.getGrade();
            num++;
            if (student.getGrade() > max) {
                max = student.getGrade();
            } else if (student.getGrade() < down) {
                down = student.getGrade();
            }

        }
        int average = count / num;

        System.out.println("总分为：" + count);
        System.out.println("平均分为：" + average);
        System.out.println("最高分为：" + max);
        System.out.println("最低分为：" + down);
    }
}
