import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        a.add("bca");
        a.add("dadafa");
        a.add("dddaaa");
        a.add("dddaaa");
        a.add("你好啊");
        a.add("我来啦你干嘛呢");
        a.add("别跑啊");
        System.out.println("源ArrayList："+a);
        for (int i = 0;i<a.size();i++){
            String b = a.get(i);
            /*if (b.length()<4){
                String ele = a.remove(i);
                c.add(ele);
            }*/
            if (b.length()>4){
                a.remove(i);
                i--;
            }
        }
        //System.out.println("删除后ArrayLIstanbul:"+c);
        System.out.println("删除后ArrayLIstanbul:"+a);

    }
}
