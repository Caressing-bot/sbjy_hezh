package com.Test.bean;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * id
     */
    private long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    private String sex;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 是否删除
     */
    private String delFlag;

    public User() {

    }

    public User(long id, String name, Integer age, String sex, String createTime, String delFlag) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.createTime = createTime;
        this.delFlag = delFlag;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", createTime='" + createTime + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
