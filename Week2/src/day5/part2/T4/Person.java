package day5.part2.T4;

/**
 * ccb
 **/
public class Person {
    private String PName;
    //methods
    public Phone sellPhone(){
        return new Phone("IPhone",5000);
    }
    //constructor

    public Person(String PName) {
        this.PName = PName;
    }
    //getter and setter

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }
}
