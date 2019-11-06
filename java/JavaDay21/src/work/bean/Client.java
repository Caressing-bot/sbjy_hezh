package work.bean;

public class Client implements Runnable {
    private static Integer num = 80;
    private static Object object = new Object();
    @Override
    public void run() {
           while (true){
               synchronized (object){
                   if (num <= 0){
                       break;
                   }
                   num--;
                   System.out.println(Thread.currentThread().getName()+"---"+"还剩下"+num+"个座位");

               }
           }
       }
}

