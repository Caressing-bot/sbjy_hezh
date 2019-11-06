public class Demo4 {
    public static void main(String[] args) {
        //& 与： 有false则false
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(true & true);

        System.out.println("-------");

        //| 或：有true则true
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(true & true);

        System.out.println("---------");

        //! 非： 取反
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("---------");

        // ^ 异或： 不同为true，相同为false
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);

        System.out.println("---------");

        //&&和&结果一样,左边是false右边不执行
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

        System.out.println("---------");

        //||和|结果一样，左边是true右边不执行
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);

    }
}
