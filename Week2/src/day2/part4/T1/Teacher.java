package day2.part4.T1;

/**
 * ccb
 **/
public class Teacher {
    private String TID;
    private String TName;
    private String TSex;
    private int TAge;
    private Course TSubject;

    @Override
    public String toString() {
        return "Teacher{" +
                "TID='" + TID + '\'' +
                ", TName='" + TName + '\'' +
                ", TSex='" + TSex + '\'' +
                ", TAge=" + TAge +
                ", TSubject='" + TSubject.getSName() + '\'' +
                '}';
    }

    public Teacher(String TID, String TName, String TSex, int TAge,Course TSubject) {
        this.TID = TID;
        this.TName = TName;
        this.TSex = TSex;
        this.TAge = TAge;
        this.TSubject = TSubject;
    }
    public Teacher(){}
    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public String getTSex() {
        return TSex;
    }

    public void setTSex(String TSex) {
        this.TSex = TSex;
    }

    public int getTAge() {
        return TAge;
    }

    public void setTAge(int TAge) {
        this.TAge = TAge;
    }


}
