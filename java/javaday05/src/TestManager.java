import com.dfbz.bean.tempate.Manager;

public class TestManager {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.setName("Kobe");
        man.setNum(9527);
        man.setPrice(15000);
        man.setReward(3000);
        man.intro();
        man.showSalary();
        man.work();
    }
}
