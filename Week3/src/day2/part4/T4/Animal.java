package day2.part4.T4;

/**
 * ccb
 **/
public abstract class Animal {
    private String color;
    private int age;

    //methods
    public abstract void eat();
    //constructor

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    //set get


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
