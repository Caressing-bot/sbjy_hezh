package checkpoint1;

public class Test09 {
    public static void main(String[] args) {
        Count1 c1 = new Count1();
        Thread t1 = new Thread(c1);
        Count2 c2 = new Count2();
        Thread t2 = new Thread(c2);
        Count3 c3 = new Count3();
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }

    public static class Count1 implements Runnable {

        @Override
        public void run() {
            int sum = 1;
            for (int i = 1; i <= 10; i++) {
                sum *=i;
            }
            System.out.println("10!为:"+sum);
        }
    }

    public static class Count2 implements Runnable {

        @Override
        public void run() {
            int sum1 = 1;
            for (int i = 1; i <= 5; i++) {
               sum1 *=i;
            }
            System.out.println("5!为："+sum1);
        }
    }

    public static class Count3 implements Runnable {

        @Override
        public void run() {
            int sum2 = 1;
            for (int i = 1; i <= 8; i++) {
               sum2 *= i;
            }
            System.out.println("8!为："+sum2);
        }
    }
}
