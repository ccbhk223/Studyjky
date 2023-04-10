package day5.part2.T5;

/**
 * ccb
 **/
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone",8000);
        Person yuFan  = new Person();
        yuFan.setPName("羽凡");
        Person baiBaiHe  = new Person("白百合",38,phone);
        baiBaiHe.callTo(yuFan);
    }
}
