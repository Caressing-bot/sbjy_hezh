import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("test8.properties");
        properties.load(fis);
        String str = properties.getProperty("className");
        Class<?> aClass = Class.forName(str);
        Method run = aClass.getDeclaredMethod("run");
        run.invoke(aClass.newInstance());
    }
}