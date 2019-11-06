package work;


import work.bean.Client;

public class Test04 {
    public static void main(String[] args) {
        Client client = new Client();
        Thread t1 = new Thread(client,"前门上车");
        Thread t2 = new Thread(client,"中门上车");
        Thread t3 = new Thread(client,"后门上车");
        t1.start();
        t2.start();
        t3.start();

    }
}
