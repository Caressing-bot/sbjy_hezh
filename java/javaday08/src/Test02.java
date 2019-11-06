import com.dfbz.bean.tempate.Coder;
import com.dfbz.bean.tempate.Teacher;

public class Test02 {
    public static void main(String[] args) {
        Coder coder = new Coder("马化腾",null);
        coder.eat();
        coder.sleep();
        coder.qdm();
        System.out.println("----------------------");
        Teacher teacher = new Teacher("马云",null);
        teacher.eat();
        teacher.sleep();
        teacher.sk();

    }
}
