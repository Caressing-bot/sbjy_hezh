package com.dfbz.server;

import com.dfbz.bean.Apple;

public class Worker {
    public Apple pickApple(CompareAble compareAble,Apple a2,Apple a1){
        return compareAble.compare(a1,a2);
    }
}
