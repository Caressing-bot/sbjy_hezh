package com.dfbz.bean.tempate;

public class Buyer extends AdminStaff {
    public Buyer(){

    }

    public Buyer(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号为："+getId()+"的采购专员"+getName()+"在采购音响设备");
    }
}
