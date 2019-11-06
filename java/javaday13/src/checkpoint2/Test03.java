package checkpoint2;

import java.util.Iterator;
import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String a : strs) {
            if (!list.contains("a")){
                list.add(a);
            }
        }
        for (String b:list) {
            System.out.print(b+" ");
        }
        Iterator it = list.iterator();
        System.out.println();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
