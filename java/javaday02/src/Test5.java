public class Test5 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        float f1 = (float) 12345.01F;
        float f2 = (float) 12345.00F;
        float var1 = (float) (f1 > f2 ? 12456 : 12456.02);
        float var2 = var1 + 1024;
        System.out.println("var1的值：" + var1 + "var2的值:" + var2);
    }
}
