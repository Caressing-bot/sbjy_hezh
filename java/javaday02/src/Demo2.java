public class Demo2 {
    public static void main(String[] args) {
        byte b = 5;
        short s = 10;
        int i = b + s;
        short j = (short) (b + s);
        System.out.println(i + "----" + j);
    }
}
