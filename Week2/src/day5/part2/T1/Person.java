package day5.part2.T1;

/**
 * ccb
 **/
public class Person extends Phone{
    private String PName;
    private int PAge;
    //methods
    public void usePhone(Phone P){
        System.out.println(PAge+"的" +PName+
                "在使用" +P.getHBrand()+
                "手机" +super.playGame()+
                "");
    }
    //constructor
    public Person() {
    }

    public Person(String PName, int PAge) {
        this.PName = PName;
        this.PAge = PAge;
    }

    //getter and setter
    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getPAge() {
        return PAge;
    }

    public void setPAge(int PAge) {
        this.PAge = PAge;
    }
}
