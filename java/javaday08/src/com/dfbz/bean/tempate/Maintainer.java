package com.dfbz.bean.tempate;

public class Maintainer extends AdminStaff{
    public Maintainer(){

    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号为："+getId()+"的维护专员"+getName()+"在解决不能共享屏幕问题");
    }
}
