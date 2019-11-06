public class Test01 {
    public static void main(String[] args) {
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("数组最小组为：" + min);
    }
}
