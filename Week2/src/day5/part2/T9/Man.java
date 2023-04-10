package day5.part2.T9;

/**
 * ccb
 **/
public class Man {
    private String MName;
    private  int MAge;
    //methods
    public void playto(Lady lady){
        System.out.print(MName+"在逛街");
        lady.play();
    }
    public void haveGirl(Lady lady){
        System.out.print(MAge+"岁的大男孩" +MName+
                "有一个"+lady.getLAge()+"的女友");
        lady.play();
    }
    //constructor
    public Man(String MName, int MAge) {
        this.MName = MName;
        this.MAge = MAge;
    }

    //getter and setter

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public int getMAge() {
        return MAge;
    }

    public void setMAge(int MAge) {
        this.MAge = MAge;
    }
}
class Lady{
    private String LName;
    private int LAge;
    //methods
    public void play(){
        System.out.println("(" +LName+
                ")");
    }
    //constructor

    public Lady(String LName, int LAge) {
        this.LName = LName;
        this.LAge = LAge;
    }

    //getter and setter

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getLAge() {
        return LAge;
    }

    public void setLAge(int LAge) {
        this.LAge = LAge;
    }
}
