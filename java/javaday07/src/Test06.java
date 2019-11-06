import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = scanner.next();
        String s2 = s1.replace("奥巴马","*");
        System.out.println(s2);
    }
}
