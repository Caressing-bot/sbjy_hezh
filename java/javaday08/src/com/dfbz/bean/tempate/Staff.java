package com.dfbz.bean.tempate;

public abstract class Staff {
    private String name;
    private String num;
    private double salary;
    public Staff(){

    }

    public Staff(String name, String num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
    public abstract void eat();

}
