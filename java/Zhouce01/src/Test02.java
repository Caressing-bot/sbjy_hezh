import com.hzh.bean.lmpl.FindTop;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        FindTop findTop = new FindTop();
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(findTop.findMaxValue(a));
        //findTop.findMaxValue(a);
        System.out.println(Arrays.toString(findTop.findTopNValues(a, 4)));

    }
}
