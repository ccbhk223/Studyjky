package day2.part4.T3;

/**
 * ccb
 **/
public class Coder {
    private String CName;
    private String CID;
    private double CSalary;

    public void CWork() {
        System.out.println("工号为" + this.CID  +", 基本工资为" + this.CSalary +"的程序员正在努力的写" +
                "着代码");
    }

    public Coder(String CName, String CID, double CSalary) {
        this.CName = CName;
        this.CID = CID;
        this.CSalary = CSalary;
    }

    public Coder() {
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public double getCSalary() {
        return CSalary;
    }

    public void setCSalary(double CSalary) {
        this.CSalary = CSalary;
    }
}
