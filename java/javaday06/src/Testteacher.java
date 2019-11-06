import com.dfbz.bean.tempate.Teacher;

import java.util.ArrayList;

public class Testteacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("姚小明",23,"打篮球");
        Teacher t2 = new Teacher("景甜",20,"打羽毛球");
        Teacher t3 = new Teacher("薛之谦",45,"踢足球");
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        for (Teacher tr:teachers) {
            System.out.println(tr);
        }
        System.out.println("----------------------");
        for (Teacher str:teachers){
            if (str.getAge()>40){
                str.setLike("打高尔夫");
                System.out.println(str);
            }
        }
    }
}
