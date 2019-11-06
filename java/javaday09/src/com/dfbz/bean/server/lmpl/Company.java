package com.dfbz.bean.server.lmpl;

import com.dfbz.bean.server.bean.Money;

public class Company implements Money {
    double total = 1000000.0;


    @Override
    public void paySalary(Employee emp) {
        total -= emp.salary;
        System.out.println("给" + emp.name + "发工资" + emp.salary + "元，公司剩余：" + total);
    }
}
