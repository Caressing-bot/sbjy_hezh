import com.dfbz.bean.tempate.Cat;
import com.dfbz.bean.tempate.Dog;

public class Test03 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.eat();
        dog.lookHome();
        System.out.println("-------------");
        Cat cat = new Cat("波斯猫");
        cat.eat();
        cat.catchMouse();
    }
}
