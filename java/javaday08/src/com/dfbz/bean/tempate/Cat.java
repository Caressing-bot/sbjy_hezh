package com.dfbz.bean.tempate;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    public void catchMouse() {
        System.out.println(getName() + "抓老鼠");
    }
}
