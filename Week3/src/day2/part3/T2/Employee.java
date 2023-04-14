package day2.part3.T2;

/**
 * ccb
 **/
public class Employee extends Person{
    private String ID;
    private double wage;
    private  int age;
    //constructor

    public Employee(String name, String address, String ID, double wage, int age) {
        super(name, address);
        this.ID = ID;
        this.wage = wage;
        this.age = age;
    }
    //toString

    @Override
    public String toString() {
        return "员工：" +
                "姓名：" +super.getName()+
                "，ID：'" + ID +
                ", 薪资：" + wage +
                ", 年龄：" + age+
                ", 地址："+super.getAddress();
    }

    //get set

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
