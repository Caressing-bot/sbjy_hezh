package checkpoint1;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test04 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "1998-02-26";
        Date date = df.parse(str);
        System.out.println(date);

    }

    }
