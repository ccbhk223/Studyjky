package day2.part4.T4;

/**
 * ccb
 **/
public class ActedTiger extends Tiger implements Actor {
    @Override
    public void play() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 老虎在表演钻火圈");
    }
    //constructor

    public ActedTiger() {
    }

    public ActedTiger(String color, int age) {
        super(color, age);
    }
}
