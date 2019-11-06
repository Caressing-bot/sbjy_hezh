package com.dfbz.bean.tempate;

public class Student extends Persons {
    private double mark;
    public Student(){

    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void showMark(){
        System.out.println(getName()+"同学，考试得了："+getMark()+"分");
    }
}
