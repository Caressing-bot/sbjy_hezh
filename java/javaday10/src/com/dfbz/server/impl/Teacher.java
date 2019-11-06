package com.dfbz.server.impl;

import java.util.ArrayList;

public class Teacher {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dianming(ArrayList<Student> list){
        for (Student student: list){
            if ("小明".equals(student.getName())){
                student.setChuqin(false);
            }else {
                student.setChuqin(true);
            }
        }
    }
}
