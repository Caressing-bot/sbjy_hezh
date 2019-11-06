package checkpoint2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        String arr[] = {"abc", "bad", "abc", "aab", "cef", "jhi"};
        HashSet<String> set = new HashSet<>();
        for (String a : arr) {
            set.add(a);
        }
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        for (String b:list) {
            System.out.println(b);
        }
    }
}
