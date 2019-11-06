import com.dfbz.bean.server.lmpl.Coder;
import com.dfbz.bean.server.lmpl.Company;
import com.dfbz.bean.server.lmpl.Manager;

public class Test07 {
    public static void main(String[] args) {
        Manager m = new Manager("张小强", 9000.0);
        Coder c = new Coder("李小亮", 5000.0);
        Company com = new Company();
        com.paySalary(m);
        com.paySalary(c);
    }
}
