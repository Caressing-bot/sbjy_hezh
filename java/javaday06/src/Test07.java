import com.dfbz.bean.tempate.Worker;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        Worker w1 = new Worker("bz001","黄渤",45);
        Worker w2 = new Worker("bz002","孙红雷",48);
        Worker w3 = new Worker("bz003","罗志祥",35);
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        findMaxAge(workers);
    }
    public static void findMaxAge(ArrayList<Worker> Workers){
        int maxAge = Workers.get(0).getAge();
        int num=0;
        for (int i = 0;i<Workers.size();i++){
            if (Workers.get(i).getAge()>maxAge){
                maxAge = Workers.get(i).getAge();
                num = i;
            }
        }
        Workers.get(num).show();
    }
}
