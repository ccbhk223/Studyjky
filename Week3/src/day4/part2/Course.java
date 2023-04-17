package day4.part2;

public class Course {
    private String couNo;
    private String couName;

    @Override
    public String toString() {
        return "课程{" +
                "课程编号='" + couNo + '\'' +
                ", 课程名='" + couName + '\'' +
                '}';
    }
    //constructor

    public Course(String couNo, String couName) {
        this.couNo = couNo;
        this.couName = couName;


    }
    //get set

    public String getCouNo() {
        return couNo;
    }

    public void setCouNo(String couNo) {
        this.couNo = couNo;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }
}
