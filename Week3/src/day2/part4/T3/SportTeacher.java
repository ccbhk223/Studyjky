package day2.part4.T3;

/**
 * ccb
 **/
public class SportTeacher extends Teacher implements Sport {

    @Override
    public void playBasketball() {
        System.out.println("年龄为 " +super.getName()+
                " 岁的 " +super.getAge()+
                " 老师在打篮球");
    }
    //constructor

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    public SportTeacher() {
    }
}
