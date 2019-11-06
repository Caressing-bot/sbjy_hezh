package checkpoint2;

import java.util.HashMap;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        String[] str = s.split("");
        HashMap<String,Integer> map = new HashMap<>();
        for (String a:str) {
            if (!map.containsKey(a)){
                map.put(a,1);
            }else {
                int count =map.get(a);
                map.put(a,++count);
            }
        }
        StringBuilder stringBuffer = new StringBuilder();
        for (String a :map.keySet()) {
            stringBuffer.append(a+"("+map.get(a)+")");
        }
        System.out.println(stringBuffer);
    }
}
