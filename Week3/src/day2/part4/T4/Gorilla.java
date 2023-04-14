package day2.part4.T4;

/**
 * ccb
 **/
public class Gorilla extends Animal {
    @Override
    public void eat() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 大猩猩吃香蕉");
    }
    //constructor

    public Gorilla() {
    }

    public Gorilla(String color, int age) {
        super(color, age);
    }
}
