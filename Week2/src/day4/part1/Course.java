package day4.part1;

/**
 * ccb
 **/
public class Course {
    private String CNo;
    private String CName;
    private String CFoundTime;
    private String CDescribe;

    @Override
    public String toString() {
        return "Course{" +
                "CNo='" + CNo + '\'' +
                ", CName='" + CName + '\'' +
                ", CFoundTime='" + CFoundTime + '\'' +
                ", CDescribe='" + CDescribe + '\'' +
                '}';
    }

    public Course(String CNo, String CName, String CFoundTime) {
        this.CNo = CNo;
        this.CName = CName;
        this.CFoundTime = CFoundTime;
    }
    public Course(){}

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

    public String getCFoundTime() {
        return CFoundTime;
    }

    public void setCFoundTime(String CFoundTime) {
        this.CFoundTime = CFoundTime;
    }

    public String getCDeCcribe() {
        return CDescribe;
    }

    public void setCDescribe(String CDescribe) {
        this.CDescribe = CDescribe;
    }
}
