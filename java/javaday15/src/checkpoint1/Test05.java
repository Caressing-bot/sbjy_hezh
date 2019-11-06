package checkpoint1;

import checkpoint1.com.hzh.bean.Vistor;

public class Test05 {
    public static void main(String[] args) {
        Vistor vistor = new Vistor();
        Thread p1 = new Thread(vistor);
        Thread p2= new Thread(vistor);
        Thread p3 = new Thread(vistor);
        Thread p4 = new Thread(vistor);
        Thread p5 = new Thread(vistor);
        Thread p6 = new Thread(vistor);
        Thread p7 = new Thread(vistor);
        Thread p8 = new Thread(vistor);
        Thread p9 = new Thread(vistor);
        Thread p10 = new Thread(vistor);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
    }
}
