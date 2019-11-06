package com.dfbz.bean.tempate;

public class Manager extends Staff {
    public Manager(){

    }

    public Manager(String name, String num, double salary) {
        super(name, num, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getNum()+",姓名为："+getName()+"工资为："+getSalary()+"的经理在工作，管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为："+getNum()+",姓名为："+getName()+"工资为："+getSalary()+"的经理在吃鱼");
    }
}
