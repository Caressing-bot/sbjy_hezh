package checkpoint1;

public class Test10 {
    public static void main(String[] args) {
        int num = 10;
        int i = getFactotial(num);
        System.out.println(i);
    }

    private static int getFactotial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * getFactotial(num - 1);
        }
    }
}
