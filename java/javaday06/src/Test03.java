import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random a = new Random();
        for (int i =0;i<5;i++ ){
            int number = (int)(Math.random()*12);
            //int number = a.nextInt(10)+1;
            System.out.println(number);
        }
    }
}
