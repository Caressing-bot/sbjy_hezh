package work;

import java.util.HashMap;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String next = scr.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = next.toCharArray();
        for (char i : chars) {
            if (i == 32) {
                countKey(map, "空格");
            } else if (i >= 48 && i <= 57) {
                countKey(map, "数字");
            } else if (i >= 65 & i <= 90 || i >= 97 && i <= 122) {
                countKey(map, "字母");
            } else {
                countKey(map, "其他");
            }
        }
        System.out.println(map);
    }

    public static void countKey(HashMap map, String key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            int count = (int) map.get(key);
            map.put(key, ++count);
        }
    }
}
