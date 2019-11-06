import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) throws Exception {
        Object obj = createObject();
        System.out.println(obj);
    }

    private static Object createObject() throws Exception {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(new FileInputStream("test10.properties"), "UTF-8"));
        Set<String> set = properties.stringPropertyNames();
        Class<?> aClass = Class.forName(properties.getProperty("class"));
        Object obj = aClass.newInstance();
        for (String name : set) {
            String value = properties.getProperty(name);
            if (!name.equals("class")) {
                Field field = aClass.getDeclaredField(name);
                String setName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                Method method = aClass.getDeclaredMethod(setName,field.getType());
                if (field.getType() == Integer.class) {
                    Integer age = Integer.parseInt(value);
                    method.invoke(obj, age);
                } else {
                    method.invoke(obj, value);
                }

            }
        }
        return obj;
    }
}