
import java.lang.reflect.Constructor;

public class Demo3 {

    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.dfbz.bean.Student");
        //获取所有 public 的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("---------------------------");

        //获取指定参数类型的 public 的构造器
        Constructor<?> myC = aClass.getConstructor(String.class, int.class);
        System.out.println(myC);

        System.out.println("---------------------------");

        //获取所有的构造器
        Constructor<?>[] dConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : dConstructors) {
            System.out.println(c);
        }

        System.out.println("---------------------------");

        //获取指定参数类型的 所有的构造器
        Constructor<?> myDc = aClass.getDeclaredConstructor(String.class);
        System.out.println(myDc);

    }
}
