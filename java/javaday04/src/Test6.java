public class Test6 {
    public static void main(String[] args) {
        printX();
    }

    private static void printX() {
        for (int i = 1; i <=10;i++){//行
            for (int k =1;k<=10;k++){
                if (k == i || i+k==11){
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
