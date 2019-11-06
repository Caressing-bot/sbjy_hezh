package com.dfbz.bean.tempate;

public class Person {
    private String name;
    private String age;
    public Person(){

    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void sleep(){
        System.out.println(name+"睡觉");
    }
}
