package checkpoint2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test07 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String s = scr.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        String[] str = s.split(" ");
        for (String a:str) {
            if (!map.containsKey(a)){
                map.put(a,1);
            }else {
                int count = map.get(a);
                map.put(a,count++);
            }
        }
        Set<String> set = map.keySet();
        for (String i :set) {
            System.out.println(i + " = "+ map.get(i));
        }
        //System.out.println(map);
    }
}
