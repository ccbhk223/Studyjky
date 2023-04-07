package day4.part3.T3;

/**
 * ccb
 **/
public class Course {
    private String CNo;
    private String CName;
    //toString

    @Override
    public String toString() {
        return "课程编号：" + CNo + ',' +
                "课程名：" + CName ;
    }

    //constructor

    public Course(String CNo, String CName) {
        this.CNo = CNo;
        this.CName = CName;
    }

    public Course() {
    }

    //getter and setter
    public String getCNo() {
        return CNo;
    }

    public void setCNo(String CNo) {
        this.CNo = CNo;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }
}
