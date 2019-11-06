package checkpoint1;

import java.util.Random;
import java.util.concurrent.*;

public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e = Executors.newFixedThreadPool(3);
        Future<Integer> a = e.submit(new Count());
        Future<Integer> b = e.submit(new Count2());
        Future<Integer> c = e.submit(new Count2());
        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
        double avg = (double) (a.get() + b.get() + c.get()) / 3;
        System.out.println("三个数平均数为："+avg);
    }

    public static class Count implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                Random rad = new Random();
                a += rad.nextInt(100) + 1;
            }
            a /= 10;
            return a;
        }
    }

    public static class Count2 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int b = 0;
            for (int i = 0; i < 10; i++) {
                Random rad = new Random();
                b += rad.nextInt(100) + 1;

            }
            b /= 10;
            return b;
        }
    }

    public static class Count3 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int c = 0;
            for (int i = 0; i < 10; i++) {
                Random rad = new Random();
                c += rad.nextInt(100) + 1;

            }
            c /= 10;
            return c;
        }
    }
}
