public class Test05 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg = getAvg(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }
}
