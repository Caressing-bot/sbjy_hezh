package com.dfbz.bean.tempate;

public class Teacher extends Person {
    public Teacher(){

    }

    public Teacher(String name, String age) {
        super(name, age);
    }

    public void sk(){
        System.out.println(getName()+"上课");
    }
}
