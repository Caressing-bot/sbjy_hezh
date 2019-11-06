package checkpoint1;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("001","小明");
        map.put("002","小红");
        map.put("002","小芳");
        map.put("004","小丽");
        String s = map.get("001");
        System.out.println(s);
        map.remove("004");
        System.out.println(map);
    }
}
