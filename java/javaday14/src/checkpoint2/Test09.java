package checkpoint2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        Scanner scr = new Scanner(System.in);
        while (map.size()<5){
            System.out.println("请输入书名，价格");
            String s = scr.nextLine();
            String[] split = s.split(",");
            map.put(split[0],Double.parseDouble(split[1]));
        }
        map.remove("C++");
        map.put("java",38.5);
        for (String s:map.keySet()) {
            double value = map.get(s);
            System.out.println("书名为："+s +"，价格为："+value);
        }
    }
}
