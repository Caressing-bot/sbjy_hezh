
import com.dfbz.bean.Student;

public class Demo2 {

    public static void main(String[] args) throws Exception {
        //第三种方式，通过包名地址(最为常见的)
        Class<?> clazz = Class.forName("com.dfbz.bean.Student");
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Student student = (Student) clazz.newInstance(); //其实等同于 new Student()
        System.out.println(student);

        Class<?> aClass = Class.forName("java.lang.String");
        //String str = new String();
        Object o = aClass.newInstance(); //相当于 new String()
        System.out.println(o);// 是一个空字符串来的
        System.out.println("------");
    }

}
