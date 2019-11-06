package com.dfbz.bean.tempate;

public class Manager {
    private String name;
    private int num;
    private int price;
    private int reward;
    public Manager(){

    }
    public Manager(String name,int num,int price,int reward){
        this.name = name;
        this.num = num;
        this.price = price;
        this.reward = reward;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNum(){
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
    public  int getReward(){
        return reward;
    }
    public void setReward(int reward){
        this.reward = reward;
    }
    public void intro(){
        System.out.println("经理名字："+name);
        System.out.println("工号："+num);
    }
    public void showSalary(){
        System.out.println("基本工资为："+price+"奖金为:"+reward);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码....");
    }


}
