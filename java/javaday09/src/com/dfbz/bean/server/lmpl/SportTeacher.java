package com.dfbz.bean.server.lmpl;

import com.dfbz.bean.server.bean.Sport;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher(){

    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+name+"的老师在打篮球");
    }
}
