package checkpoint1;

import checkpoint1.com.hzh.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test07 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("小明",18),"西藏");
        map.put(new Student("小红",17),"西藏");
        map.put(new Student("小丽",19),"西藏");
        map.put(new Student("小芳",20),"西藏");
        Set<Student> students = map.keySet();
        for (Student student:students) {
            String value = map.get(student);
            System.out.println(student+" "+value);
        }
        System.out.println("---------------");
        Set<Map.Entry<Student, String>> set = map.entrySet();
        for (Map.Entry<Student, String> str :set) {
            Student key = str.getKey();
            String value = str.getValue();
            System.out.println(key + "  "+ value);
        }




    }
}
