package day2.part4.T3;

/**
 * ccb
 **/
public class SportStudent extends Student implements Sport {
    @Override
    public void playBasketball() {
        System.out.println("年龄为 " +super.getName()+
                " 岁的 " +super.getAge()+
                " 学生在打篮球");
    }
    //constructor

    public SportStudent(String name, int age) {
        super(name, age);
    }

    public SportStudent() {
    }
}
