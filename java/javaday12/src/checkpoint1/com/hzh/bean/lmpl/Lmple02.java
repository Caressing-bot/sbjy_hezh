package checkpoint1.com.hzh.bean.lmpl;

import checkpoint1.com.hzh.bean.Lnter;

public class Lmple02<T> implements Lnter<T> {

    @Override
    public void Show(T t) {
        System.out.println(t);
    }
}
