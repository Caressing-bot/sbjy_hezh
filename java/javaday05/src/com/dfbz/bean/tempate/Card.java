package com.dfbz.bean.tempate;

public class Card {
    private String color;
    private char num;
    public Card(){

    }

    public Card(String color, char num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public void showCard() {
        System.out.println(color + num);
    }
}
