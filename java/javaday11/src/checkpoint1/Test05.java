package checkpoint1;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,500);
//       int year = cal.get(Calendar.YEAR);
//       int month = cal.get(Calendar.MONTH)+1;
//       int day = cal.get(Calendar.DAY_OF_MONTH);
//       String str = year + "";
//       str = str.substring(str.length()-2);
//       System.out.println(str+"年"+ month +"月"+day+"日");

        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yy年MM月dd日");
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }

}
