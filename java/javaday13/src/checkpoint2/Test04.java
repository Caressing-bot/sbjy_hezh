package checkpoint2;

import checkpoint2.sever.Student;

import java.util.HashSet;

public class Test04 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet();
        Student s1 = new Student("小张",18,"男");
        Student s2 = new Student("小张",18,"男");
        Student s3 = new Student("小黄",19,"女");
        Student s4 = new Student("小明",20,"女");
        Student s5 = new Student("老王",16,"男");
        Student s6 = new Student("老朱",17,"女");
        Student s7= new Student("张三",16,"男");
        Student s8 = new Student("李四",15,"女");
        Student s9 = new Student("熊二",20,"男");
        Student s10 = new Student("熊大",21,"男");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);
        set.add(s9);
        set.add(s10);

        for (Student a:set) {
            System.out.println(a);
        }
    }
}
