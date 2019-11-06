package checkpoint1;

import checkpoint1.com.hzh.bean.Ticket;

public class Test08 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread a1 = new Thread(ticket,"第一个窗口");
        Thread a2 = new Thread(ticket,"第二个窗口");
        Thread a3 = new Thread(ticket,"第三个窗口");
        Thread a4 = new Thread(ticket,"第四个窗口");
        a1.start();
        a2.start();
        a3.start();
        a4.start();
    }
}
