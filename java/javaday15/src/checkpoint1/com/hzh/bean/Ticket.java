package checkpoint1.com.hzh.bean;

public class Ticket extends Thread {
    private int num = 1;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (num == 80) {
                    break;
                }
                synchronized (object) {
                    System.out.println("当前" + Thread.currentThread().getName() + "卖了一张票,剩余" + (79 - num) + "张");
                    num++;
                }
            }
        }
    }
}
