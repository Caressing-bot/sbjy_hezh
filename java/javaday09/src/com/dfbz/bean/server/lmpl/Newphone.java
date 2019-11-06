package com.dfbz.bean.server.lmpl;

import com.dfbz.bean.server.bean.Play;

public class Newphone extends Oldphone implements Play {

    public void call(){
        System.out.println("新手机打电话");
    }
    public void sendMessage(){
        System.out.println("新手机发短信");
    }

    @Override
    public void playGAME() {
        System.out.println("新手机玩游戏");
    }
}
