package checkpoint2;

public class Test02 {
    public static void main(String[] args) {
        String str = "hello";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "q";
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒："+(end - start));

        StringBuilder builder = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
             builder.append("2");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("共耗时毫秒："+(end1 - start1));
    }
}
