package com.dfbz.bean.tempate;

public class Duck extends Fowl {
    public Duck() {

    }

    @Override
    public void eat() {
        System.out.println(getAge() + "的" + getColor() + "的鸭子在吃饭");
    }

    public void swim() {
        System.out.println(getAge() + "的" + getColor() + "的鸭子在游泳");
    }
}
