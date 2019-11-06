package com.dfbz.bean;

import com.dfbz.server.FightAble;
import com.dfbz.server.impl.Master;
import com.dfbz.server.impl.warrior;

public class Player {
    public FightAble fight(String str){
        if ("武力角色".equals(str)){
            return new warrior();
        }else if ("法力角色".equals(str)){
            return new Master();
        }
        return null;
    }
}
