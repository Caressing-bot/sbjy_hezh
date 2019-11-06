package checkpoint1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","baby");
        map.put("谢霆锋","张柏芝");
        Set<String> strings = map.keySet();
        Iterator it = strings.iterator();
        while (it.hasNext()){
            Object next = it.next();
            String value = map.get(next);
            System.out.println(next+" "+value);
        }

    }
}
