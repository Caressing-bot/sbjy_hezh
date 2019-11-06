package work.bean;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();
    public GouWuChe(){

    }
    public void addGoods(Goods goods){
        System.out.println("加入"+goods.name+"成功");
        list.add(goods);
    }
    public void showGoods(){
        System.out.println("你所选够的商品为：");
        for (Goods i:list) {
            Goods goods = i;
            System.out.println(goods.id+","+goods.name+goods.price);
        }

    }
    public void  total(){
        double num = 0;
        double sum = 0;
        for (int i = 0; i <list.size() ; i++) {
            Goods goods = list.get(i);
            sum +=goods.price;
            if (goods instanceof EGoods){

            }
        }
    }
}
