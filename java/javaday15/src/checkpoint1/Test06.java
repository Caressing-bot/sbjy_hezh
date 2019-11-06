package checkpoint1;

import checkpoint1.com.hzh.bean.Cup;

public class Test06 {
    public static void main(String[] args) {
        Cup cup = new Cup();
        Thread a1 = new Thread(cup,"实体店");
        Thread a2 = new Thread(cup,"官网");
        a1.start();
        a2.start();
    }
}
