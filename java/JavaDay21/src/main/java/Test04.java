import com.dfbz.bean.Show;

public class Test04 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Show show = new Show();
        Class c = show.getClass();
        Show o = (Show) c.newInstance();
        o.Show();
    }
}
