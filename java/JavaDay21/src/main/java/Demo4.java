
import java.lang.reflect.Constructor;

public class Demo4 {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.dfbz.bean.Student");
        //获取指定参数类型的 所有的构造器
        Constructor<?> myDc = aClass.getDeclaredConstructor(String.class);
        System.out.println(myDc);
        myDc.setAccessible(true);//暴力反射
        Object stu = myDc.newInstance("张三");// new String("张三")
        System.out.println(stu);
    }
}
