
import java.lang.reflect.Field;

public class Demo6 {

    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.dfbz.bean.Student");
        Field[] fields = aClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("---------------------------------------");

        Field[] myFields = aClass.getDeclaredFields();
        for (Field f : myFields) {
            System.out.println(f);
        }

        System.out.println("---------------------------------------");

        //获取指定的属性（成员变量）
        Object o = aClass.newInstance();// Student stu = new Student()
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);//暴力反射
        age.set(o,18); //相当于 stu.age = 18
        Object value = age.get(o);//相当于 访问 stu.age
        System.out.println(value);

    }

}
