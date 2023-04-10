package day5.part2.T10;

/**
 * ccb
 **/
public class Parents {
    private String Name;
    private int Age;
    //methods
    public String say(){
        return ",会说话,";
    }
    //constructor

    public Parents(String name, int age) {
        Name = name;
        Age = age;
    }

    //getter and setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
