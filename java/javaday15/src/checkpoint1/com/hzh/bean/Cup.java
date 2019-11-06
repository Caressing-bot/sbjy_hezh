package checkpoint1.com.hzh.bean;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Cup implements Runnable {
    private static Integer num = 100;
    private static Integer count = 1;
    private static Integer count1 = 1;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (num == 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第：" + (101 - num) + "个限量版水杯");
                num--;
                if (Thread.currentThread().getName() == "实体店"){
                    count++;
                }else if (Thread.currentThread().getName() == "网店"){
                    count1 = num - count;
                }
            }
        }
        System.out.println("实体店总共销售了："+count);
        System.out.println("网店总共销售了："+count1);
    }
}
