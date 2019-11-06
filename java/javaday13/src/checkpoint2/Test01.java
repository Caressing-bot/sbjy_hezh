package checkpoint2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        HashSet<String> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);

    }
}
