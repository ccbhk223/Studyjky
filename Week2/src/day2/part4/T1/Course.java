package day2.part4.T1;

/**
 * ccb
 **/
public class Course {
    private String SNo;
    private String SName;
    private String SFoundTime;
    private String SDescribe;

    @Override
    public String toString() {
        return "Subject{" +
                "SNo='" + SNo + '\'' +
                ", SName='" + SName + '\'' +
                ", SFoundTime='" + SFoundTime + '\'' +
                ", SDescribe='" + SDescribe + '\'' +
                '}';
    }


    public Course(String SNo, String SName, String SFoundTime, String SDescribe) {
        this.SNo = SNo;
        this.SName = SName;
        this.SFoundTime = SFoundTime;
        this.SDescribe = SDescribe;
    }
    public Course(){}

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

    public String getSFoundTime() {
        return SFoundTime;
    }

    public void setSFoundTime(String SFoundTime) {
        this.SFoundTime = SFoundTime;
    }

    public String getSDescribe() {
        return SDescribe;
    }

    public void setSDescribe(String SDescribe) {
        this.SDescribe = SDescribe;
    }
}
