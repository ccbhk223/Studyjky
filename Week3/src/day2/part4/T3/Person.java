package day2.part4.T3;

/**
 * ccb
 **/
public abstract class Person {
    private String name;
    private int age;

    //methods
    public abstract void eat();
    //constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
//get set

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
}
