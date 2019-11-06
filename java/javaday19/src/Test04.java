import java.io.*;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Scanner scr = new Scanner(System.in);
        String line = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 3; i++) {
                String next = scr.next();
                bw.write(next);
                bw.newLine();
            }
            bw.close();
            String code = scr.next();
            int count = 0;
            while (null != (line = br.readLine())) {
                if (code.equals(line)) {
                    System.out.println("验证成功");
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("验证失败");
            }
            br.close();
        }
    }

