package com.dfbz.bean.tempate;

public class Teachers extends Persons {
    private String subject;
    public Teachers(){

    }

    public Teachers(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void showke(){
        System.out.println(getName()+"老师，讲授"+getSubject());
    }
}
