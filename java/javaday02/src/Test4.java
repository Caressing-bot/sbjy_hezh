public class Test4 {
    public static void main(String[] args) {
        text4();
    }

    public static void text4() {
        int a1 = 10;
        int a2 = 11;
        System.out.println("10是偶数？" + (a1 % 2 == 0 ? true : false));
        System.out.println("11是偶数？" + (a2 % 2 == 0 ? true : false));
        int b1 = 12;
        int b2 = 13;
        System.out.println("12是奇数？" + (b1 % 2 == 0 ? false : true));
        System.out.println("13是奇数？" + (b2 % 2 == 0 ? false : true));
    }

}
