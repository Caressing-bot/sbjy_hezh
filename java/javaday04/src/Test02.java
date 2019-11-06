public class Test02 {
    public static void main(String[] args) {
        int n = 100;
        int a = getSum(n);
        System.out.println(a);
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
