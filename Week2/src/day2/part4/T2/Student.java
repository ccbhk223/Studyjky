package day2.part4.T2;

/**
 * ccb
 **/
public class Student {
    private String SNO;
    private String SName;
    private String SSex;
    private double SStature;
    private int SAge;

    public Student(String SNO, String SName, String SSex, double SStature, int SAge) {
        this.SNO = SNO;
        this.SName = SName;
        this.SSex = SSex;
        this.SStature = SStature;
        this.SAge = SAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + SNO + '\'' +
                ", 姓名='" + SName + '\'' +
                ", 性别='" + SSex + '\'' +
                ", 身高=" + SStature +
                ", 年龄=" + SAge +
                '}';
    }

    public Student(){}

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSSex() {
        return SSex;
    }

    public void setSSex(String SSex) {
        this.SSex = SSex;
    }

    public double getSStature() {
        return SStature;
    }

    public void setSStature(double SStature) {
        this.SStature = SStature;
    }

    public int getSAge() {
        return SAge;
    }

    public void setSAge(int SAge) {
        this.SAge = SAge;
    }
}
