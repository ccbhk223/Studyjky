package day2.part3.T2;

/**
 * ccb
 **/
public class Person {
    private String name;
    private String address;
    //constructor

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }
    //get set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
