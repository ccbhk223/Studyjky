package day2.part4.T4;

/**
 * ccb
 **/
public class Teacher {
    private String TName;
    private int TAge;
    private String TContent;

    public void eat() {
        System.out.println("年龄为"+this.TAge+"的"+this.TName+"老师正在吃饭");
    }

    public void teach() {
        System.out.println("年龄为"+this.TAge+"的"+this.TName+"老师正在亢奋的讲着"+this.TContent);
    }

    public Teacher(String TName, int TAge, String TContent) {
        this.TName = TName;
        this.TAge = TAge;
        this.TContent = TContent;
    }

    public Teacher() {
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public int getTAge() {
        return TAge;
    }

    public void setTAge(int TAge) {
        this.TAge = TAge;
    }

    public String getTContent() {
        return TContent;
    }

    public void setTContent(String TContent) {
        this.TContent = TContent;
    }
}
