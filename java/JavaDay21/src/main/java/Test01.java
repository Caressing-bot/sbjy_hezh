import org.junit.*;

public class Test01 {
    public static Test01 c;

    @Test
    public void additive() {
        System.out.println("加法");
    }

    @Test
    public void multiplication() {
        System.out.println("乘法");
    }

    @Test
    public void subtraction() {
        System.out.println("减法");
    }

    @Test
    public void division() {
        System.out.println("除法");
    }

    @BeforeClass
    public static void tBefore(){
        c = new Test01();
        System.out.println("创建一个新的"+c);
    }

    @AfterClass
    public  static void tAfter(){
        c = null;
        System.out.println("将值为空"+c);
    }
}
