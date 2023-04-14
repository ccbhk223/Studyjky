package day2.part3.T2;

/**
 * ccb
 **/
public class Manager extends Employee {
    private String level;


    //constructor
    public Manager(String name, String address, String ID, double wage, int age,String level) {
        super(name, address, ID, wage, age);
        this.level = level;
    }
    //toString


    @Override
    public String toString() {
        return "员工：" +
                "姓名：" +super.getName()+
                "，ID：'" + super.getID() +
                ", 薪资：" + super.getWage() +
                ", 年龄：" + super.getAge()+
                ", 地址："+ super.getAddress()+
                ", 级别："+ level;
    }
}
