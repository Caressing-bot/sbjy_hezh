package checkpoint1;


import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection co = new ArrayList();
        co.add(1);
        co.add(2);
        co.add(3);
        co.remove(2);
        System.out.println(co.size());
        co.clear();
        System.out.println(co);
    }
}
