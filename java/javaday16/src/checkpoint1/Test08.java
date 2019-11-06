package checkpoint1;

import checkpoint1.com.hzh.bean.Student;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        Student[] stu ={
                new Student("小明",95),
                new Student("小张",90),
                new Student("小华",80),
                new Student("小芬",100)
        };
        for (Student a:stu) {
            System.out.println(a.toString());
        }
        System.out.println("=============================");
        Arrays.sort(stu,(a,b) -> b.getResult() - a.getResult());


        for (Student b:stu) {
            System.out.println(b.toString());
        }
    }
}
