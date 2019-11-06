package checkpoint1;

import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(3,2);
        System.out.println(list.get(3));
        list.remove(3);
        list.clear();
        System.out.println(list.size());
    }
}
