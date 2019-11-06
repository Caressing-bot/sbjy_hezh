package com.dfbz.server;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通打击");
    }
}
