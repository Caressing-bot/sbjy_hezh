public class Test08 {
    public static void main(String[] args) {
        double a = 30.0;
        double b = degree(a);
        System.out.println("摄氏度为：" + b + "°--" + "华氏度" + a + "°");
        System.out.println("华氏度为：" + a + "°--" + "摄氏度" + b + "°");
    }

    public static double degree(double b) {
        b = (9.0 / 5) * b + 32;
        return b;
    }
}
