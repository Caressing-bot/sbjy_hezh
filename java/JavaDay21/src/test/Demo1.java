package test;

import org.junit.*;

public class Demo1 {

    @BeforeClass
    public static void beforeC(){
        System.out.println("类加载（运行）所有的方法之前，执行这个静态的BeforeClass");
    }

    @AfterClass
    public static void afterC(){
        System.out.println("类加载（运行）所有的方法之后，执行这个静态的AfterClass");
    }

    @Before
    public void before(){
        System.out.println("调用Test方法前运行");
    }

    @After
    public void after(){
        System.out.println("调用Test方法后运行");
    }


    @Test
    public void eat(){
        System.out.println("吃饭");
    }


    @Test
    public void sleep(){
        System.out.println("睡觉");
    }




}
