package checkpoint2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");
        ArrayList<String> array2 = new ArrayList<>();
        array1.add("e");
        array1.add("f");
        array1.add("a");
        array1.add("d");
        array1.add("g");
        HashSet<String> set = new HashSet<>();
        for (String a:array1) {
            set.add(a);
        }
        for (String b:array2) {
            set.add(b);
        }
        for (String c:set) {
            System.out.print(c+" ");
        }
    }
}
