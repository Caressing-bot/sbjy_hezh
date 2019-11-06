package checkpoint1;

import checkpoint1.com.hzh.bean.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("广州", new Student("小明",18));
        map.put("深圳", new Student("小红",19));
        map.put("上海", new Student("小丽",20));
        map.put("西藏", new Student("小芳",17));
        map.put("美国", new Student("小芬",21));
        Set<String> strings = map.keySet();
        for (String a:strings) {
            Student value = map.get(a);
            System.out.println(a + " "+value);
        }
        System.out.println("--------");
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> a:entries) {
            String key = a.getKey();
            Student value = a.getValue();
            System.out.println(key +" "+ value);
        }
    }
}
