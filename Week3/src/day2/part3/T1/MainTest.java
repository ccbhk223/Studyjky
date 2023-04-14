package day2.part3.T1;

/**
 * ccb
 **/
public class MainTest {
    public static void main(String[] args) {
        airplaneFly canFlyService = new airplaneFly();
        CanFlyService canFlyService1 = new BirdFly();
        CanFlyTest canFlyTest = new CanFlyTest();
        canFlyTest.makeFly(canFlyService);
        canFlyTest.makeFly(canFlyService1);

    }
}
