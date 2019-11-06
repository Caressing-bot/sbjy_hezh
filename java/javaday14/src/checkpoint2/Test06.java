package checkpoint2;

import java.util.ArrayList;
import java.util.HashMap;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String a : list) {
            char[] chars = a.toCharArray();
            for (char i : chars) {
                if (map.get(i) == null) {
                    map.put(i, 1);
                } else {
                    map.put(i,map.get(i)+1);
                }
            }
        }
        System.out.println(map);
    }
}
