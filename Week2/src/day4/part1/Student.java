package day4.part1;

/**
 * ccb
 **/
public class Student {
    private String SNO;
    private String SName;
    private String SSex;
    private double SStature;
    private int SAge;
    private Course SCourse;//存储学生选择的一门课程

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
                "学号=" + SNO  +
                ", 姓名=" + SName  +
                ", 性别=" + SSex  +
                ", 身高=" + SStature +
                ", 年龄=" + SAge +
                ", 选择课程=" + SCourse.getCName() +
                '}';
    }

    public Student(){}

    public Course getSCourse() {
        return SCourse;
    }

    public void setSCourse(Course SCourse) {
        this.SCourse = SCourse;
    }

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