import com.dfbz.bean.server.lmpl.Fruit;
import com.dfbz.bean.server.lmpl.GouWuChe;
import com.dfbz.bean.server.lmpl.Laptop;
import com.dfbz.bean.server.lmpl.Phone;

public class Test08 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Laptop lap = new Laptop("笔记本","g10000",10000);
        Phone phone = new Phone("手机","g10001",5000);
        Fruit fruit = new Fruit("苹果","g20000",50);
        System.out.println("添加商品");
        gouWuChe.addGoods(lap);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        gouWuChe.showGoods(gouWuChe.getList());
        gouWuChe.total(gouWuChe.getList());
    }
}
