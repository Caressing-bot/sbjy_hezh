package checkpoint2;

import java.util.HashMap;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入学生信息，格式为姓名，年龄");
        while (map.size()<5){
            String s = scr.next();
            String[] str = s.split("，");
            System.out.println("请再输入另一个学生信息");
            map.put(str[0],Integer.valueOf(str[1]));
        }
        System.out.println(map);
    }
}
