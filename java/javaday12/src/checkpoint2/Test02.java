package checkpoint2;

import checkpoint2.sever.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List a = new ArrayList();
        Person p1 = new Person("小敏",18,1.67);
        Person p2 = new Person("张三",18,1.80);
        Person p3 = new Person("李四",18,1.60);
        Person p4 = new Person("小三",18,1.74);
        Person p5 = new Person("小张",18,1.78);
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);
        double max = 0;
        double mix = 2.0;
        String name = "";
        String name1 = "";
        Iterator<Person> per = a.iterator();
        while (per.hasNext()){
            Person person = per.next();
            if (person.getHeigh()>max){
                max = person.getHeigh();
                name = person.getName();
            }else if (person.getHeigh()<mix){
                mix = person.getHeigh();
                name1 = person.getName();
            }
        }
        System.out.println("最高的人是："+name+",身高是："+ +max);
        System.out.println("最矮的人是："+name1+",身高是："+ +mix);

    }
}
