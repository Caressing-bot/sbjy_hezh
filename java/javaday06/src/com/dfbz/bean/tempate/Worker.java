package com.dfbz.bean.tempate;

public class Worker {
    private String id;
    private String name;
    private int age;
    public Worker(){

    }
    public Worker(String id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("最高年龄worker对象:");
        System.out.println(id+","+name+","+age);
    }
}
