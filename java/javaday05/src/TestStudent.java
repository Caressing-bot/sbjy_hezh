import com.dfbz.bean.tempate.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("韩同学", 18, "java面向对象的知识");
        stu.eat();
        stu.study();
    }
}
