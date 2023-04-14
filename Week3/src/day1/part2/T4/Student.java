package day1.part2.T4;

/**
 * ccb
 **/
public class Student {
    private String SNo;
    private String SName;
    private String SGender;//性别
    //toString

    @Override
    public String toString() {
        return "学生：" + SName+
                " ，学生编号：" + SNo+
                " ，学生性别：" + SGender+"\n";
    }

    //constructor

    public Student(String SNo, String SName, String SGender) {
        this.SNo = SNo;
        this.SName = SName;
        this.SGender = SGender;
    }

    //getter and setting

    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSGender() {
        return SGender;
    }

    public void setSGender(String SGender) {
        this.SGender = SGender;
    }
}
