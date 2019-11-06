package com.dfbz.bean.server.bean;

public interface A {
    void showA();
     public default void showB(){
        System.out.println("BBBB");
    }
}
