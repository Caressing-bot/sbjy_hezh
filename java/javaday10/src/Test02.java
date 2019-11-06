import com.dfbz.server.impl.Course;
import com.dfbz.server.impl.Student;
import com.dfbz.server.impl.Teacher;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("小红");
        student1.setChuqin(true);
        Student student2 = new Student();
        student2.setName("小亮");
        student2.setChuqin(true);
        Student student3 = new Student();
        student3.setName("小明");
        student3.setChuqin(false);
        ArrayList<Student> li = new ArrayList<>();
        li.add(student1);
        li.add(student2);
        li.add(student3);
        Teacher teacher = new Teacher();
        teacher.setName("赵老师");
        Course course = new Course();
        course.setTeacher(teacher);
        course.setCoursename("JAVA");
        course.setList(li);
        course.show();
    }
}
