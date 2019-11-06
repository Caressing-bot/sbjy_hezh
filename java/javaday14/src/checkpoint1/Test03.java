package checkpoint1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("001","小明");
        map.put("002","小红");
        map.put("003","小芳");
        map.put("004","小丽");
        Collection<String> values = map.values();
        for (String a:values) {
            System.out.println(a);
        }
        Iterator a = values.iterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }

    }
}
