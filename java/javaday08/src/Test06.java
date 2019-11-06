import com.dfbz.bean.tempate.Cock;
import com.dfbz.bean.tempate.Duck;

public class Test06 {
    public static void main(String[] args) {
        Cock cock = new Cock();
        cock.setAge(2);
        cock.setColor("红色");
        cock.zhuoMi();
        cock.eat();

        Duck duck = new Duck();
        duck.setAge(1);
        duck.setColor("黑色");
        duck.eat();
        duck.swim();
    }
}
