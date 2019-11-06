public class Test8 {
    public static void main(String[] args) {
        char ch = 'J';
        ch = (char) ('J' + 32);
        System.out.println(ch);
        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);
        double d3 = 5.34;
        int i3 = 2;
        double sum3 = d3 + i3;
        System.out.println("sum3的值:" + sum3);
        System.out.println("sum3的整数部分：" + (int) (sum3));
        double d4 = 3.32;
        int i4 = 3;
        int mul4 = (int) (d4 * i4);
        System.out.println("mul4的整数部分：" + mul4);
    }
}
