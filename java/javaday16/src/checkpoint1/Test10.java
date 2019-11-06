package checkpoint1;

import checkpoint1.com.hzh.bean.Person;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scr = new Scanner(System.in);
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    synchronized (person) {
                        try {
                            person.setName("路飞");
                            person.setSex("男");
                            person.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (person){
                        System.out.println(person.toString());
                        person.notify();
                    }
                }
            }
        }).start();
    }
}
