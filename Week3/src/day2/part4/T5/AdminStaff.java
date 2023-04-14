package day2.part4.T5;

/**
 * ccb
 **/
public class AdminStaff extends Employee {
    @Override
    public void work() {
        System.out.println("行政部人员" +super.getName()+
                "在采购");
    }
    public void dance(){
        if (super.getSalary()>10000.0){
            System.out.println("行政部人员 " + super.getName()+
                    " 会跳舞");
        }else System.out.println("行政部人员 " +super.getName()+
                " 不会跳舞");
    }
    //constructor

    public AdminStaff() {
    }

    public AdminStaff(String ID, String name, double salary) {
        super(ID, name, salary);
    }
}
