package day2.part3.T1;

/**
 * ccb
 **/
public class Student {
    private String stuName;
    private String stuNo;
    private int stuAge;

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public int getStuAge() {
        return stuAge;
    }

    public Student(String stuName, String stuNo, int stuAge){
        this.stuName = stuName;
        this.stuNo = stuNo;
        this.stuAge = stuAge;
    }
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
