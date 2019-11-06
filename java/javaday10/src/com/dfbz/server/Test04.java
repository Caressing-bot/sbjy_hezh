package com.dfbz.server;

import com.dfbz.bean.Apple;
import com.dfbz.server.impl.CompareAppleImpl;

public class Test04 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple a1 = new Apple(5,"青色");
        Apple a2 = new Apple(3,"红色");
        Apple a3 = worker.pickApple(new CompareAppleImpl(),a1,a2);
        System.out.println("默认挑大的：");
        System.out.println(a3.getSize()+"-"+a3.getColor());

        Apple a4 = worker.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor())?a1:a2;
            }
        },a1,a2);
        System.out.println("挑红的：");
        System.out.println(a4.getSize()+"-"+a4.getColor());

    }
}
