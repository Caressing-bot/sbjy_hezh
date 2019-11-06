package checkpoint2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String abc = sc.nextLine();
        LinkedHashSet link = new LinkedHashSet();
        char[] chars = abc.toCharArray();
        for (char i:chars) {
            link.add(i);
        }
        for (Object a:link) {
            System.out.print(a);
        }
    }
}
