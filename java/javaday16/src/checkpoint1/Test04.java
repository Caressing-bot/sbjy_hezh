package checkpoint1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test04 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Count count = new Count();
        Count2 count2 = new Count2();
        Count3 count3 = new Count3();
        service.submit(count);
        service.submit(count2);
        service.submit(count3);
    }

    public static class Count implements Runnable {
        @Override
        public void run() {
            int sum = 1;
            for (int i = 1; i <= 10; i++) {
                sum *= i;
                System.out.println("10!的值为：" + sum);
            }
        }
    }
    public static class Count2 implements Runnable {
        @Override
        public void run() {
            int sum2 = 1;
            for (int i = 1; i <= 5; i++) {
                sum2 *= i;
                System.out.println("5!的值为：" + sum2);
            }
        }
    }
    public static class Count3 implements Runnable {
        @Override
        public void run() {
            int sum3 = 1;
            for (int i = 1; i <= 8; i++) {
                sum3 *= i;
                System.out.println("8!的值为：" + sum3);
            }
        }
    }
}
