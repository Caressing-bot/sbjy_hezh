import com.dfbz.bean.tempate.Card;

public class TestCard {
    public static void main(String[] args) {
        Card card = new Card();
        card.setColor("黑桃");
        card.setNum('A');
        card.showCard();
    }
}
