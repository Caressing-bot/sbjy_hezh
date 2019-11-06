package checkpoint3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int docsum = 0;
        int javasum = 0;
        int txtsum = 0;
        File file = new File(scr.next());
        for (File f : file.listFiles()) {
            if (f.getName().endsWith("java")) {
                javasum++;
            } else if (f.getName().endsWith("doc")) {
                docsum++;
            } else if (f.getName().endsWith("txt")) {
                txtsum++;
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("java", javasum);
        map.put("doc", docsum);
        map.put("txt", txtsum);

        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s + "的类型的文件个数为：" + map.get(s) + "个");
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> s : entries) {
            String key = s.getKey();
            Integer sum = s.getValue();
            System.out.println(key + "的类型的文件个数为：" + sum + "个");
        }
    }
}
