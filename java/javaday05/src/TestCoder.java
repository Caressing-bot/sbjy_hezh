import com.dfbz.bean.tempate.Coder;

public class TestCoder {
    public static void main(String[] args) {
        Coder r =new Coder();
        r.setName("James");
        r.setNum(0025);
        r.setPrice(10000);
        r.intro();
        r.showSalary();
        r.work();
    }
}
