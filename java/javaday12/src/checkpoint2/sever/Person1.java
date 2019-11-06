package checkpoint2.sever;

public class Person1 {
    private String name;
    private int age;
    private double high;
    public Person1(){

    }

    public Person1(String name, int age, double high) {
        this.name = name;
        this.age = age;
        this.high = high;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + ", high=" + high
               ;
    }
}
