import com.dfbz.bean.tempate.Teacher;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t =new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象的知识");
        t.eat();
        t.teach();
    }

}
