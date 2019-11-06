package checkpoint2;

import java.util.HashMap;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);
        map.put("柳岩", map.get("柳岩") + 300);
        Set<String> set = map.keySet();
        for (String a : set) {
            int value = map.get(a);
            System.out.println("姓名为：" + a + " 工资为：" + value);
        }
    }
}
