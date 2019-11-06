
import java.lang.reflect.Method;

public class Demo5 {

    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.dfbz.bean.Student");
        //获取所有的public的方法
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("---------------------------------");

        //获取指定参数类型的public方法
        Object o = aClass.newInstance();//相当于 new Student()

        Method setMethod = aClass.getMethod("setName",String.class);//获取 setName(String name)方法
        setMethod.invoke(o, "张三");//通过反射 调用方法并赋值 setName("张三")

        Method getMethod = aClass.getMethod("getName");//获取 getName(String name)方法
        Object value = getMethod.invoke(o);//通过反射 调用getName方法

        System.out.println(value);

        System.out.println("---------------------------------");

        //获取所有的方法（包含私有的,但是不包含父类的）
        Method[] dMethods = aClass.getDeclaredMethods();
        for (Method m : dMethods) {
            System.out.println(m);
        }

        System.out.println("---------------------------------");

        //获取指定参数类型的私有的方法
        Object o2 = aClass.newInstance();//相当于 new Student()
        Method codingMethod = aClass.getDeclaredMethod("coding", String.class);
        codingMethod.setAccessible(true);//暴力反射
        codingMethod.invoke(o2, "JAVA");//通过反射，调用coding方法
    }

}
