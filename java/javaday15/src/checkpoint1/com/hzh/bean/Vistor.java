package checkpoint1.com.hzh.bean;

import java.util.concurrent.locks.ReentrantLock;

public class Vistor implements Runnable {
    private int count = 1;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.println("游客"+ count+ "准备通过山洞");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("游客"+count+"已通过山洞");
        count++;
        lock.unlock();
    }
}
