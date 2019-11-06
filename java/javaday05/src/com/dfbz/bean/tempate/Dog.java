package com.dfbz.bean.tempate;

public class Dog {
    private String name;//私有定义
    private int age;
    public Dog(){//吾参构造方法

    }
    public Dog(String name,int age){
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void showMsg(){
        System.out.println("狗的名称为："+name+",年龄为："+age);
    }
}
