package com.dfbz.bean.tempate;

public class Coder {
    private String name;
    private int num;
    private int price;
    public Coder(){

    }
    public Coder(String name,int num,int price){
        this.num = num;
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int num(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+num);
    }
    public void showSalary(){
        System.out.println("基本工资为："+price+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码....");
    }
}
