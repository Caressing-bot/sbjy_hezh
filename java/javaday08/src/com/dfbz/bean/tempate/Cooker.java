package com.dfbz.bean.tempate;

public class Cooker extends Staff{
    public Cooker(){

    }

    public Cooker(String name, String num, double salary) {
        super(name, num, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getNum()+",姓名为："+getName()+"工资为："+getSalary()+"的厨师在工作，炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为："+getNum()+",姓名为："+getName()+"工资为："+getSalary()+"的厨师在吃肉");
    }
}
