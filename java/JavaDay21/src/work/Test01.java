package work;

public class Test01 {

    public static void main(String[] args) {
        int[] sorce = {99,100,98,97,96};
        int max = 0;
        int mix = sorce[0];
        int count = 0;
        for (int i :sorce) {
            if (max < i){
                max = i;
            }else if (mix > i){
                mix = i;
            }
            count += i;
        }
        int average = (count-max-mix)/(sorce.length-2);
        System.out.println(max);
        System.out.println(mix);
        System.out.println(count);
        System.out.println(average);
    }
}
