import com.dfbz.bean.server.lmpl.Animal;
import com.dfbz.bean.server.lmpl.Cat;
import com.dfbz.bean.server.lmpl.Dog;

public class Test05 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        Animal c = new Cat();
        c.eat();
        if (d instanceof Dog) {
            Dog dog = (Dog) d;
            dog.lookHome();
        }
        if (c instanceof Cat) {
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
    }
}
