package day2.part4.T5;

/**
 * ccb
 **/
public abstract class Employee {
    private String ID;
    private String name;
    private double salary;


    //methods
    public abstract void work();
    //constructor

    public Employee() {
    }

    public Employee(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    //get set

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
