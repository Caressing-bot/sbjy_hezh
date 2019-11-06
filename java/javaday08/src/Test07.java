import com.dfbz.bean.tempate.Cooker;
import com.dfbz.bean.tempate.Manager;

public class Test07 {
    public static void main(String[] args) {
        Manager manager = new Manager("老王","m110",10000.0);
        manager.eat();
        manager.work();
        Cooker cooker = new Cooker("小王","c110",6000.0);
        cooker.eat();
        cooker.work();
    }




}
