import com.dfbz.bean.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
    public static void main(String[] args) throws Exception {
        Student stu = new Student();
        Class c = stu.getClass();
        Constructor<Student> ct = c.getConstructor(String.class,int.class,String.class);
        Student student = ct.newInstance("小明", 30, "男");
        System.out.println(student.toString());

        System.out.println("------------------------------");

    }
}
