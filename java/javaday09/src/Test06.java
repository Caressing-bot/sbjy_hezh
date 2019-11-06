import com.dfbz.bean.server.bean.Sport;
import com.dfbz.bean.server.lmpl.SportStudent;
import com.dfbz.bean.server.lmpl.SportTeacher;
import com.dfbz.bean.server.lmpl.Student;
import com.dfbz.bean.server.lmpl.Teacher;

public class Test06 {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("马云",45);
        SportTeacher t2 = new SportTeacher("大姚",35);
        Student s1 = new Student("小王",20);
        SportStudent s2 = new SportStudent("王中王",21);
        goToSport(t2);
        goToSport(s2);
    }
    public static void goToSport(Sport sport){
        sport.playBasketball();
    }
}
