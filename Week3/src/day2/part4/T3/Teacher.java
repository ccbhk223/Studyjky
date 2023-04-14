package day2.part4.T3;

/**
 * ccb
 **/
public class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("年龄为 " +super.getAge()+
                " 岁的 " +super.getName()+
                " 老师正在吃工作餐");
    }
    //constructor

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }
}
