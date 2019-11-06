package checkpoint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerMap = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♣","♦");
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int count = 1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");
        for (String number:numbers) {
            for (String color:colors) {
                String card = color + number;
                pokerMap.put(count++,card);
            }
        }
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        ArrayList<Integer> nop1 = new ArrayList<>();
        ArrayList<Integer> nop2 = new ArrayList<>();
        ArrayList<Integer> nop3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();
        for (int i = 0; i <numberList.size() ; i++) {
            Integer no = numberList.get(i);
            if (i>=51){
                dipaiNo.add(no);
            }else {
                if (i%3 == 0){
                    nop1.add(no);
                }else if (i%3 == 1){
                    nop2.add(no);
                }else {
                    nop3.add(no);
                }
            }
        }
        Collections.sort(nop1);
        Collections.sort(nop2);
        Collections.sort(nop3);
        Collections.sort(dipaiNo);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (Integer i:nop1){
            String card =pokerMap.get(i);
            player1.add(card);
        }
        for (Integer i:nop2){
            String card =pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i:nop3){
            String card =pokerMap.get(i);
            player3.add(card);
        }
        for (Integer i:dipaiNo) {
            String card =pokerMap.get(i);
            dipai.add(card);
        }
        System.out.println("小明："+player1);
        System.out.println("小红："+player2);
        System.out.println("小花："+player3);
        System.out.println("底牌："+dipai);
    }
}
