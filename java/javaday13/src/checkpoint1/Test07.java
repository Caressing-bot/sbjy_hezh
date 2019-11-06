package checkpoint1;

import checkpoint1.sever.Person;

import java.util.HashSet;

public class Test07 {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person a1 = new Person("小明",18);
        Person a2 = new Person("小红",11);
        Person a3 = new Person("小黄",17);
        Person a4 = new Person("小蓝",16);
        Person a5 = new Person("小绿",15);
        people.add(a1);
        people.add(a2);
        people.add(a3);
        people.add(a4);
        people.add(a5);
        for (Person l:people) {
            System.out.println(l.toString());
        }
    }
}
