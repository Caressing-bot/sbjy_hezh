import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        File file1 = new File("text1.txt");
        FileWriter fw = new FileWriter(file1);
        FileReader fr = new FileReader(file);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> list = new ArrayList<>();
        String len;
        while (null!=(len = br.readLine())){
            list.add(len);
        }
        br.close();
        Collections.reverse(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            bw.write(it.next());
            bw.newLine();
        }
        bw.close();
    }
}
