package checkpoint1;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("这是主线程");
        Zi zi =new Zi();
        zi.start();
        System.out.println("这是主线程");
        Run run = new Run();
        Thread thread = new Thread(run);
        thread.start();
    }

    public static class Zi extends Thread{
        @Override
        public void run() {
            System.out.println("这是继承子线程:Zi");
        }
    }
    public static class Run implements Runnable{

        @Override
        public void run() {
            System.out.println("这是实现子线程：Run");
        }
    }
}
