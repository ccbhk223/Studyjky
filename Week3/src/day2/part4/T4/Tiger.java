package day2.part4.T4;

/**
 * ccb
 **/
public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 老虎吃肉");
    }
    //constructor

    public Tiger() {
    }

    public Tiger(String color, int age) {
        super(color, age);
    }
}
