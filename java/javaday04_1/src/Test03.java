public class Test03 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        int[] newArr = new int[3];
        System.out.println("nums数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            newArr[i] = nums[i] * 2;
        }
        System.out.println();
        System.out.println("newArr新数组：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


    }
}
