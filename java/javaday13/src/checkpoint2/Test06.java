package checkpoint2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size()<10){
            int a = random.nextInt(20)+1;
            set.add(a);
        }
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
