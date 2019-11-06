public class Test04 {
    public static void main(String[] args) {
        int num = 90;
        char aChar = getChar(num);
        System.out.println("字符：" + aChar);
    }

    public static char getChar(int num) {
        char ch = (char) num;
        if (num >= 65 && num <= 90) {
            return ch;
        } else if (num >= 97 && num <= 122) {
            return ch;
        } else if (num >= 49 && num <= 57) {
            return ch;
        } else {
            return ' ';
        }

    }
}
