import com.dfbz.bean.tempate.Student;
import com.dfbz.bean.tempate.Teachers;

public class Test05 {
    public static void main(String[] args) {
        Teachers teachers =new Teachers("王小平",0,"Java课");
        teachers.showke();
        Student student =new Student("李小乐",0,90.0);
        student.showMark();
    }
}
