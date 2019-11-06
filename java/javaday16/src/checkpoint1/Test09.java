package checkpoint1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        set.add(4);
        set.add(5);
        set.add(6);
        map.put(001, "小明");
        map.put(002, "小红");
        map.put(003, "小芬");
        list.forEach(list1 -> System.out.println(list1));
        set.forEach(set1 -> System.out.println(set1));
        map.forEach((a, b) -> System.out.println("[" + a + "=" + b + "]"));
    }
}
