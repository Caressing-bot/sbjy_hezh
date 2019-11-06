import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String qq = sc.next();
        System.out.println("这个QQ号码是否正确：" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq) {
        char[] a = qq.toCharArray();
        if (qq.length() < 5 || qq.length() > 12) {
            return false;
        } else if (qq.startsWith("0")) {
            return false;
        } else {
            for (char m : a) {
                if (m <= '9' && m >= '0') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
