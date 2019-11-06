package checkpoint2;

import java.util.HashSet;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (true){
            System.out.println("请输入数字");
            int i = scr.nextInt();
            if (i == -1){
                break;
            }else{
                set.add(i);
            }
        }
        for (Integer a :set) {
            sum +=a;
        }
         int average = sum/set.size();
        System.out.println("求和的结果为"+sum);
        System.out.println("平均值为："+average);
    }
}
