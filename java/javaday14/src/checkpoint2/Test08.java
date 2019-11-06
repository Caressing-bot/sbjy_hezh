package checkpoint2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random rom = new Random();
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        int mix = 100;
        int count = 0;
        int total = 0;
        while (map.size()<5){
            String next = scr.next();
            int i = rom.nextInt(101);
            map.put(next,i);
        }
        Set<String> key = map.keySet();
        for (String a:key) {
            total +=map.get(a);
            count++;
            if (map.get(a)>max){
                max = map.get(a);
            }
            if (map.get(a)<mix){
                mix = map.get(a);
            }
        }
        System.out.println("总分为："+total);
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+mix);
        System.out.println("平均分为："+(total/count));
    }
}
