import com.dfbz.bean.Player;
import com.dfbz.server.FightAble;

public class Test05 {
    public static void main(String[] args) {
        System.out.println("选择：法术角色");
        Player player = new Player();
        FightAble s1 =player.fight("法力角色");
        s1.specialFight();
        s1.commonFight();
        System.out.println("选择：武力角色");
        s1 = player.fight("武力角色");
        s1.specialFight();
        s1.commonFight();
    }
}
