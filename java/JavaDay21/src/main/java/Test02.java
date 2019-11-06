import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Class c = list.getClass();
        Method method = c.getMethod("add", Object.class);
        method.invoke(list,"666");
        System.out.println(list);
    }
}
