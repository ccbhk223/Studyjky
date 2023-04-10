package day5.part2.T10;

/**
 * ccb
 **/
public class Cookie extends Parents{
    public Cookie(String name, int age) {
        super(name, age);
    }
    //methods
    public void des(){
        System.out.println(super.getAge()+"岁的厨师" +super.getName()+super.say()+
                "炒菜");
    }

}
class Waiter extends Parents {

    public Waiter(String name, int age) {
        super(name, age);
    }
    //methods
    public void des(){
        System.out.println(super.getAge()+"岁的服务员" +super.getName()+super.say()+
                "上菜");
    }
}

