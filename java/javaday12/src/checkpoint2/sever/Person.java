package checkpoint2.sever;

public class Person {
    private String name;
    private int age;
    private double heigh;
    public Person(){

    }

    public Person(String name, int age, double heigh) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
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

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
}
