package checkpoint1;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat date  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = date.format(now);
        System.out.println(str);
    }
}
