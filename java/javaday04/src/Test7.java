public class Test7 {
    public static void main(String[] args) {
        double a1 = 10.1;
        double a2 = 10.4;
        double a3 = 10.5;
        double a4 = 10.9;

    }

    public static double round(double a) {
        if (a*10%10<5){
            int b = (int)a;
            return b;
        }else {
            int b = (int)a + 1;
            return b;
        }

    }
}
