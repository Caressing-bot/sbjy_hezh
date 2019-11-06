package checkpoint1;

import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("小明");
        list.add("小红");
        list.add("小黄");
        list.add("小张");
        list.addFirst("雄雄");
        list.addLast("熊哥");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
