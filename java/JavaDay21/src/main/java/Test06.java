import java.lang.reflect.Method;

public class Test06 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.dfbz.bean.Show");
        Object show = aClass.newInstance();
        setProperty(show, "name", "张三");
        setProperty(show, "age", 20);
        System.out.println("名字："+getProperty(show,"name"));
        System.out.println("年龄："+getProperty(show,"age"));
    }

    public static void setProperty(Object obj, String pro, Object value)throws Exception {
        Class<?> aClass = obj.getClass();
        String setMethodName = "set" + pro.substring(0, 1).toUpperCase() + pro.substring(1);
        Method method = aClass.getDeclaredMethod(setMethodName, value.getClass());
        method.invoke(obj,value);
    }

    private static Object getProperty(Object obj, String pro) throws Exception {
        Class<?> aClass  = obj.getClass();
        String getMethodName = "get" + pro.substring(0,1).toUpperCase() + pro.substring(1);
        Method method = aClass.getDeclaredMethod(getMethodName);
        return method.invoke(obj);
    }
}
