import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int temp = 0;
        int max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = in.nextInt();
        System.out.println("请输入第二个数据");
        int b = in.nextInt();
        System.out.println("请输入第三个数据");
        int c = in.nextInt();
        temp = a > b?a:b;
        max = temp>c?temp:c;
        System.out.println("三个数的最大值为："+max);
    }


}
