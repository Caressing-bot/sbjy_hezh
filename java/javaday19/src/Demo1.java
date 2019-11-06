import java.io.*;
import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        String line = null;
        while (null !=(line = br.readLine())){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);

        }
        br.close();
        for (int i = 1; i <map.size() ; i++) {
            String key = String.valueOf(i);
            String value = map.get(key);
            bw.write(key+"."+value);
            bw.newLine();
        }
        bw.close();

    }
}
