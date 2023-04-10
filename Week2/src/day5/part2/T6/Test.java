package day5.part2.T6;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.AName = "Tom";
        cat.AColor = "棕色";
        cat.eat();
        cat.catchMouse();
        Dog dog = new Dog();
        Animal dog1 = new Dog();
        dog.AName = "Jerry";
        dog.AColor = "白色";
        dog.eat();
        dog1.eat();
        dog.lookHome();
    }
}
