package com.dfbz.bean.tempate;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    public void lookHome() {
        System.out.println(getName() + "看家");
    }
}
