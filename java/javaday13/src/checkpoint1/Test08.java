package checkpoint1;

import java.util.Iterator;
import java.util.LinkedList;

public class Test08 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (String i : list) {
            System.out.print(i + " ");
        }

    }
}
