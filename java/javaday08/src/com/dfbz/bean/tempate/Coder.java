package com.dfbz.bean.tempate;

public class Coder extends Person{
    public Coder(){

    }

    public Coder(String name, String age) {
        super(name, age);
    }

    public void qdm(){
        System.out.println(getName()+"敲代码");
    }
}
