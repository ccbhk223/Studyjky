package day2.part4.T4;

/**
 * ccb
 **/
public class ActedGorilla extends Gorilla implements Actor {
    @Override
    public void play() {
        System.out.println("" +super.getAge()+
                " 岁的 " +super.getColor()+
                " 大猩猩在表演骑自行车");
    }
    //constructor

    public ActedGorilla() {
    }

    public ActedGorilla(String color, int age) {
        super(color, age);
    }
}
