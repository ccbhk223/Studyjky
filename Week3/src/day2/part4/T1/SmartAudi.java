package day2.part4.T1;

/**
 * ccb
 **/
public class SmartAudi extends Audi implements Smart {
    @Override
    public void automaticParking() {
        System.out.println("智能奥迪车在自动泊车");
    }

    @Override
    public void automaticDrive() {
        System.out.println("智能奥迪车在无人驾驶");
    }
}
