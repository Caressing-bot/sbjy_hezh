package checkpoint1;

public class Test09 {
    public static void main(String[] args) {
        int num = 101;
        int sum = getSum(num);
        System.out.println(sum);
    }

    private static int getSum(int num) {
        System.out.println();
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num - 1);
        }

    }
}
