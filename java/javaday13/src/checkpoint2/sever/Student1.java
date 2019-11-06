package checkpoint2.sever;

public class Student1 {
    private String name;
    private int age;
    private int result;
    public Student1(){

    }

    public Student1(String name, int age, int result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "name=" + name +  ", age=" + age + ", result=" + result ;
    }
}
