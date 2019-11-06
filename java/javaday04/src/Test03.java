public class Test03 {
    public static void main(String[] args) {
        int length = 20;
        int width = 8;
        int zc = getPerimeter(length, width);
        int area = getArea(length, width);
        System.out.println("长方形周长：" + zc);
        System.out.println("长方形面积:" + area);
    }

    public static int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }
}
