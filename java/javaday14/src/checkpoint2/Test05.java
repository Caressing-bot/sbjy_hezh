package checkpoint2;

import java.util.HashMap;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c == 32) {
                countingKey(map, "空格");
            } else if (c >= 48 && c <= 57) {
                countingKey(map, "数字");
            } else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                countingKey(map, "字母");
            } else {
                countingKey(map, "其他");
            }
        }
        System.out.println(map);
    }

    private static void countingKey(HashMap<String, Integer> map, String key) {
        if (map.get(key) == null) {
            map.put(key, 1);
        } else {
            map.put(key, (int) map.get(key) + 1);
        }
    }
}

