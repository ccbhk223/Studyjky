package day2.part3.T3;

/**
 * ccb
 **/
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("dog",2);
        animal1.setAniName("cat");
        animal1.setAniAge(1);
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
    }
}
