package checkpoint1;

import java.util.HashSet;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
