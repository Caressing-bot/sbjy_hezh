package com.dfbz.server.impl;

import com.dfbz.server.FightAble;

public class Master implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}
