import java.util.Random;
import java.util.Scanner;

public class GameTest1 {
    public static void main(String[] args) {
        int[] computer = {1, 1};//计算机初始方
        int[] player = {1, 1};//玩家初始方
        printNum(computer, player);//打印双方数字
        System.out.println("请选择用几号数去碰电脑的几号数:");
        Scanner s = new Scanner(System.in);
        while (true) {
           if (computer[0] == 0 && computer[1] == 0) {
                   System.out.println("电脑获胜");
                   break;
               } else if (player[0] == 0 && player[1] == 0) {
                   System.out.println("玩家获胜");
               break;
           } else {
               String[] str = s.nextLine().split(" ");//分割线
               int x = Integer.parseInt(str[0]);
               int y = Integer.parseInt(str[1]);

               player[x-1] = player[x-1] + computer[y-1];
               if (player[x-1] > 9) {//取余得到超过10后的
                   player[x-1] = player[x-1]%10;
               }
               printNum(computer,player);

               computerRandom(computer,player);
           }
        }

    }
    public static void printNum(int[] a,int[] b) {
        System.out.println("当前数字结果为:");
        System.out.println(a[0] + " " +a[1]);
        System.out.println(b[0] + " " +b[1]);
    }
    public static void computerRandom(int[] c,int[] p) {
        Random r = new Random();
        int a = r.nextInt(2) + 1;
        int b = r.nextInt(2) + 1;

        c[a-1] = c[a-1] + p[b-1];
        if (c[a-1] > 9) {
            c[a-1] = c[a-1]%10;
        }
        System.out.println("电脑回合随机生成的数字为:" + a + " " + b);
        printNum(c, p);
    }
}