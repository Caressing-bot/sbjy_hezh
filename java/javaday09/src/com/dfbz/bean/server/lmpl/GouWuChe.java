package com.dfbz.bean.server.lmpl;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public ArrayList<Goods> getList() {
        return list;
    }

    public void setList(ArrayList<Goods> list) {
        this.list = list;
    }

    public void addGoods(Goods goods) {
        list.add(goods);
        System.out.println("加入" + goods.name + "成功");
    }

    public void showGoods(ArrayList<Goods> list) {
        System.out.println("您选购的商品为：");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).id + "," + list.get(i).name + "," + list.get(i).price);

        }
        System.out.println("------------------");
    }

    public void total(ArrayList<Goods> list) {
        double t = 0;
        double b = 0;
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            t += list.get(i).price;
            if (list.get(i) instanceof EGoods) {
                b += list.get(i).price * 0.88;
            } else {
                d += list.get(i).price;
            }
        }
        System.out.println("原价为：" + t);
        System.out.println("折后价为：" + (b + d));
    }
}
