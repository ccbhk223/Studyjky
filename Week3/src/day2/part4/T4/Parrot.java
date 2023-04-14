package day2.part4.T4;

/**
 * ccb
 **/
public class Parrot extends Animal {
    @Override
    public void eat() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 鹦鹉在吃小米");
    }

    public void say() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 在说你好");
    }
    //constructor

    public Parrot() {
    }

    public Parrot(String color, int age) {
        super(color, age);
    }
}
