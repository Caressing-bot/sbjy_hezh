import com.dfbz.bean.Student;

public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式，通过.class 拿到Class对象
        Class<Student> aClass = Student.class;
        System.out.println(aClass);

        //第二方式，通过java对象的实例，有一个getClass()方法，拿到Class对象
        Student stu = new Student();
        Class<?> stuClass = stu.getClass();
        System.out.println(stuClass.toString());

        //第三种方式，通过包名地址(最为常见的)
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz);

    }
}
