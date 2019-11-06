package checkpoint1;

import checkpoint1.com.hzh.bean.Person;

public class Test07 {
    public static void main(String[] args) {
        Person person = new Person();
        Thread door1 = new Thread(person,"前门上车");
        Thread door2 = new Thread(person,"中门上车");
        Thread door3 = new Thread(person,"后门上车");
        door1.start();
        door2.start();
        door3.start();
    }
}
