package checkpoint2;

import checkpoint2.sever.Student1;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        HashSet<Student1> set = new HashSet();
        Student1 a1 = new Student1("小明", 18, 88);
        Student1 a2 = new Student1("小黄", 18, 85);
        Student1 a3 = new Student1("小王", 20, 90);
        Student1 a4 = new Student1("小红", 19, 80);
        Student1 a5 = new Student1("小张", 19, 95);
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);
        int sum = 0;
        Iterator<Student1> it = set.iterator();
        int max = 0;
        int mix = 100;
        for (Student1 a : set) {
            sum += a.getResult();
            if (max <= a.getResult()) {
                max = a.getResult();
            }
            if (mix >= a.getResult()) {
                mix = a.getResult();
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(mix);
        System.out.println(sum / set.size());
    }
}
