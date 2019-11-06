package com.dfbz.server.impl;

import java.util.ArrayList;

public class Course {
    String coursename;
    Teacher teacher;
    ArrayList<Student> list;

    public Course(){

    }

    public Course(String coursename, Teacher teacher, ArrayList<Student> list) {
        this.coursename = coursename;
        this.teacher = teacher;
        this.list = list;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public void show(){
        System.out.println("课程名称："+coursename);
        if (null != teacher) {
            System.out.println("授课老师：" + teacher.getName());
        }
        for (Student student: list) {
            if (student.getChuqin()) {
                System.out.println("上课：" + student.getName());
            }
            else {
                System.out.println("旷课："+student.getName());
            }
        }
    }
}
