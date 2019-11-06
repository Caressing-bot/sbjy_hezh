import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.dfbz.bean.Person");
        Object obj = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("setname",String.class);
        method.invoke(obj,"小占");
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,18);
        System.out.println(obj);
    }
}
