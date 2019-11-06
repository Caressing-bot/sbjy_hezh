import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] abc = {1, 2, 3};
        System.out.println(Arrays.toString(abc));
        int a = 0;
        a = abc[0];
        abc[0] = abc[2];
        abc[2] = a;

        System.out.println(Arrays.toString(abc));
    }
}
