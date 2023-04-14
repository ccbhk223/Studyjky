package day2.part4.T4;

/**
 * ccb
 **/
public class ZooManager {
    private String name;
    private int age;

    //methods
    public void feed(Animal animal) {
        animal.eat();
    }

    public void letItShow(Actor actor) {
        if (actor instanceof Parrot) {
            Parrot parrot = ((Parrot) actor);
            parrot.say();
        } else actor.play();
    }
    //constructor

    public ZooManager() {
    }

    public ZooManager(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
