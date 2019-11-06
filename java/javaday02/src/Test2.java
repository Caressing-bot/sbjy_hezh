public class Test2 {
    public static void main(String[] args) {
    addition();
    }

    public static void addition() {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println("b3的值为：" + b3);

        System.out.println("----------------");

        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println("s3的值为：" + s3);
    }
}
