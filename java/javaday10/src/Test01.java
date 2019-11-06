import com.dfbz.server.HandleAble;

import static java.lang.Double.parseDouble;


public class Test01 {
    public static void main(String[] args) {
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                String s1 = num.substring(0, num.indexOf("."));
                double i = parseDouble(s1);
                double j = 0;
                if (num.charAt(num.indexOf(".")+5)>=5){
                    String s2 = num.substring(0, num.indexOf(".")+5);
                    j = parseDouble(s2)+0.0001;
                }else if (num.charAt(num.indexOf(".")+5)<5){
                    String s2 = num.substring(0, num.indexOf(".")+5);
                    j = parseDouble(s2);

                }
                System.out.println("原数字："+num);
                System.out.println("取整后："+i);
                System.out.println("保留4位小数后："+j);
            }
        }.HandleString("23.23456789");

    }

}
