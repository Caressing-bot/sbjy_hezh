package checkpoint3;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        Random random = new Random();
        while (set.size() < 4) {
            String id = "";
            for (int i = 0; i < 8; i++) {
                id += random.nextInt(10);
            }
            set.add(id);
        }
        ArrayList<String> ids = new ArrayList(set);
        ArrayList<String> fruit = new ArrayList();
        fruit.add("苹果");
        fruit.add("香蕉");
        fruit.add("西瓜");
        fruit.add("橘子");
        for (int i = 0; i < ids.size(); i++) {
            map.put(ids.get(i), fruit.get(i));
        }
        System.out.println(map);
    }
}
