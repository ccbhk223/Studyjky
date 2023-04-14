package day2.part4.T4;

/**
 * ccb
 **/
public class ActedParrot extends Parrot implements Actor {
    @Override
    public void play() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 在表演过跷跷板");
    }
    //constructor

    public ActedParrot() {
    }

    public ActedParrot(String color, int age) {
        super(color, age);
    }
}
