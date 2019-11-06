package com.dfbz.server.impl;

import com.dfbz.server.FightAble;

public class warrior implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}
