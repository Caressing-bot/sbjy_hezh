package checkpoint1;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
    ArrayList<String> list = add("小明","小红","小黄");
        for (String a :list ) {
            System.out.println(a);
        }
    }
    public static ArrayList add(String... str){
        ArrayList list = new ArrayList();
        for (String a:str) {
            list.add(a);
        }
        return list;
    }
}
