import com.dfbz.bean.server.lmpl.Newphone;
import com.dfbz.bean.server.lmpl.Oldphone;

public class Test04 {
    public static void main(String[] args) {
        Oldphone old = new Oldphone();
        old.call();
        old.sendMessage();
        Newphone ne = new Newphone();
        ne.call();
        ne.sendMessage();
        ne.playGAME();
    }
}
