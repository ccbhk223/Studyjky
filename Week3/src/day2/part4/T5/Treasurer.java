package day2.part4.T5;

/**
 * ccb
 **/
public class Treasurer extends Employee {
    @Override
    public void work() {
        System.out.println("财务部人员" +super.getName()+
                "在采购");
    }
    public void magic(){
        if (super.getSalary()>10000.0){
            System.out.println("行政部人员 " +super.getName()+
                    " 会玩魔术");
        }else System.out.println("行政部人员 " +super.getName()+
                " 不会玩魔术");
    }
    //constructor

    public Treasurer() {
    }

    public Treasurer(String ID, String name, double salary) {
        super(ID, name, salary);
    }
}
