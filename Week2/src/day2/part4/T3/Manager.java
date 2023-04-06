package day2.part4.T3;

/**
 * ccb
 **/
public class Manager {
    private String MName;
    private String MID;
    private double MSalary;
    private double MBonus;

    public void MWork() {
        System.out.println("工号为" + this.MID  +", 基本工资为" + this.MSalary +", 奖金为" + this.MBonus +"的项目经理正在" +
                "努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }

    public Manager(String MName, String MID, double MSalary, double MBonus) {
        this.MName = MName;
        this.MID = MID;
        this.MSalary = MSalary;
        this.MBonus = MBonus;
    }

    public Manager() {
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public double getMSalary() {
        return MSalary;
    }

    public void setMSalary(double MSalary) {
        this.MSalary = MSalary;
    }

    public double getMBonus() {
        return MBonus;
    }

    public void setMBonus(double MBonus) {
        this.MBonus = MBonus;
    }
}
