public class Test08 {
    public static void main(String[] args) {
       String str = "javajﬁewjavajﬁowfjavagkljjava";
        int count = getCount(str,"java");
        System.out.println( str+"字符串中java的数量："+count);
    }

    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            int b =str.indexOf(ch);
            str = str.substring(b + ch.length());
            count++;
        }
        return count;
    }
}
