package checkpoint1;

import java.util.HashMap;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("001","小明");
        map.put("002","小红");
        map.put("003","小芳");
        map.put("004","小丽");
        Set<String> strings = map.keySet();
        for (String a:strings) {
            System.out.println(a);
        }

    }
}
