package com.dfbz.bean.server.lmpl;

import com.dfbz.bean.server.bean.Sport;

public class SportStudent extends Student implements Sport {
    public SportStudent(){

    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+name+"的学生在打篮球");
    }
}
