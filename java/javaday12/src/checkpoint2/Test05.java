package checkpoint2;

import checkpoint2.sever.Person1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        List<Person1> list = new ArrayList();
        Person1 a1 = new Person1("小明",18,1.80);
        Person1 a2 = new Person1("小芳",19,1.67);
        Person1 a3 = new Person1("小红",20,1.90);
        Person1 a4 = new Person1("小宏",14,1.60);
        Person1 a5 = new Person1("小鸿",16,1.75);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        Iterator<Person1> lte = list.iterator();
        while (lte.hasNext()){
            Person1 per = lte.next();
            per.setAge(per.getAge()+2);
        }
        for (Person1 asd:list) {
            System.out.println(asd);
        }
    }
}
