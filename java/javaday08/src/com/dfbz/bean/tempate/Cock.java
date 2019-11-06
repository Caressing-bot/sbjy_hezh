package com.dfbz.bean.tempate;

public class Cock extends Fowl {
    public Cock() {

    }

    @Override
    public void eat() {
        System.out.println(getAge() + "的" + getColor() + "的公鸡在打鸣");

    }

    public void zhuoMi() {
        System.out.println(getAge() + "的" + getColor() + "的公鸡在啄米");
    }
}
