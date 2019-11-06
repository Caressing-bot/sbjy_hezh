package checkpoint1;

import checkpoint1.com.hzh.bean.lmpl.Lmple01;
import checkpoint1.com.hzh.bean.lmpl.Lmple02;

public class Test07 {
    public static void main(String[] args) {
        Lmple01 l1 = new Lmple01();
        Lmple02<Integer> l2 = new Lmple02<>();
        l1.Show("你好");
        l2.Show(123);
    }
}
