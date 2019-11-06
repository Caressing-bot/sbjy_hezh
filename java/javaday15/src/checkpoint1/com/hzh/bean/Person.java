package checkpoint1.com.hzh.bean;

public class Person implements Runnable {
    private static Integer num = 0;
    private static Object object = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (num == 80){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+",还剩"+(79-num)+"个座位");
                num++;
            }
        }

    }
}
