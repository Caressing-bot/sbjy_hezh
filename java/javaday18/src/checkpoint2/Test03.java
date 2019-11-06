package checkpoint2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {

        Count('a');
    }

    private static void Count(char ch) {
        try (FileInputStream fis = new FileInputStream("text.txt")) {
            int len;
            int count = 0;
            while (-1 != (len = fis.read())){
                if (ch == len){
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
