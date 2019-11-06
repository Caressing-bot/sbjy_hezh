package checkpoint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("001", "李晨");
        map1.put("002", "范冰冰");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("001", "马云");
        map2.put("002", "马化腾");
        System.out.println("Java基础班");
        for (String a : map1.keySet()) {
            System.out.println(a + " " + map1.get(a));
        }
        System.out.println("Java就业班");
        for (String b : map2.keySet()) {
            System.out.println(b + " " + map2.get(b));
        }
        System.out.println("=======================");
        System.out.println("Java基础班");
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getKey() +it.next().getValue());
        }
        System.out.println("Java就业班");
        Set<Map.Entry<String, String>> entries1 = map2.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey() +iterator.next().getValue());
        }
    }
}
