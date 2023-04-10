package day5.part2.T5;

/**
 * ccb
 **/
public class Person {
    private  String PName;
    private  int PAge;
    private  Phone PPhone;
    //methods
    public void callTo(Person person){
        System.out.print(PAge+"的"+PName);
        PPhone.call(person.PName);

    }
    //constructor

    public Person() {
    }

    public Person(String PName, int PAge, Phone PPhone) {
        this.PName = PName;
        this.PAge = PAge;
        this.PPhone = PPhone;
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

    public Phone getPPhone() {
        return PPhone;
    }

    public void setPPhone(Phone PPhone) {
        this.PPhone = PPhone;
    }
}
