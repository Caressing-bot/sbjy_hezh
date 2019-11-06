package com.dfbz.bean.server.lmpl;

public abstract class Person {
   String name;
   int age;
   public Person(){

   }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
