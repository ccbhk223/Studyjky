package day2.part3.T2;

/**
 * ccb
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Employee("ccb","翻斗花园","e001",10000,30);
        Person person1 = new Manager("bbc", "翻斗街道", "m001", 15000, 35, "CEO");
        Test test = new Test();
        System.out.println(person);
        System.out.println(person1);
        test.add(person);
        test.add(person1);
        System.out.println(person);
        System.out.println(person1);
    }
}
