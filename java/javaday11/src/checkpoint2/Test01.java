package checkpoint2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test01 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "1998-01-30";
        Date now = new Date();
        Date date = df.parse(str);
        long br = date.getTime();
        long today = now.getTime();
        long secone = today - br;
        System.out.println(secone/1000/60/60/24);

    }
}
