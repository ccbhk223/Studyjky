package day2.part4.T3;

/**
 * ccb
 **/
public class Student extends Person {
    @Override
    public void eat() {
        System.out.println("年龄为 " +super.getAge()+
                " 岁的 " +super.getName()+
                " 学生正在吃工作餐");
    }
    //constructor

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }
}
