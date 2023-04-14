package day2.part4.T5;

/**
 * ccb
 **/
public class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("开发部人员" +super.getName()+
                "在采购");
    }
    public void sing(){
        if (super.getSalary()>10000.0){
            System.out.println("行政部人员 " +super.getName()+
                    " 会唱歌");
        }else System.out.println("行政部人员 " +super.getName()+
                " 不会唱歌");
    }
    //constructor

    public Developer() {
    }

    public Developer(String ID, String name, double salary) {
        super(ID, name, salary);
    }
}
