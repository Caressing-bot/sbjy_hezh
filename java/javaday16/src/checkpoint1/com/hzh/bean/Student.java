package checkpoint1.com.hzh.bean;

public class Student {
    private String name;
    private int result;

    public Student() {

    }

    public Student(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
