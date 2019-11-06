package com.dfbz.bean;

import com.dfbz.server.impl.User;

public abstract class Filter {
    abstract void filterUser(User u);
}
