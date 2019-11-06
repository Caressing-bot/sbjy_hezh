import java.util.HashMap;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    private static void findChar(String line) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < line.length() ; i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
    }
}
