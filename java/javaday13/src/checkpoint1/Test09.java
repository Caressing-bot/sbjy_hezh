package checkpoint1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list);
        System.out.println("排序后："+list);
        Collections.shuffle(list);
        System.out.println("随机排序后："+list);
        Collections.reverse(list);
        for (int i :list) {
            System.out.print(i+" ");
        }
    }
}
