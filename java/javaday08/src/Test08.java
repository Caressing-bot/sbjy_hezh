import com.dfbz.bean.tempate.Buyer;
import com.dfbz.bean.tempate.Lecturer;
import com.dfbz.bean.tempate.Maintainer;
import com.dfbz.bean.tempate.Tutor;

public class Test08 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("666","傅红雪");
        lecturer.work();
        Tutor tutor = new Tutor("668","顾棋");
        tutor.work();
        Maintainer maintainer = new Maintainer("686","庖丁");
        maintainer.work();
        Buyer buyer =new Buyer("888","景甜");
        buyer.work();
    }
}
