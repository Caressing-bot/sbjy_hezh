package checkpoint1;

import checkpoint1.com.hzh.bean.Calculator;

public class Test07 {
    public static void main(String[] args) {
        inokeCalc(130, 120, (int a, int b) ->{
            return a - b;
        });
        inokeCalc(130, 120, (a, b) -> a-b);
    }
    private static void inokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
