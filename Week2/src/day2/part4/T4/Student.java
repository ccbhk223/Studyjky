package day2.part4.T4;

/**
 * ccb
 **/
public class Student {
    private String SName;
    private int SAge;
    private String SContent;

    public void eat() {
        System.out.println("年龄为"+this.SAge+"的"+this.SName+"同学正在吃饭");
    }

    public void study() {
        System.out.println("年龄为"+this.SAge+"的"+this.SName+"同学正在专心致志的听着"+this.SContent);
    }

    public Student(String SName, int SAge, String SContent) {
        this.SName = SName;
        this.SAge = SAge;
        this.SContent = SContent;
    }

    public Student() {

    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getSAge() {
        return SAge;
    }

    public void setSAge(int SAge) {
        this.SAge = SAge;
    }

    public String getSContent() {
        return SContent;
    }

    public void setSContent(String SContent) {
        this.SContent = SContent;
    }
}
