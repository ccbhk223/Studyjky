package day2.part4.T1;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.run();
        SmartAudi sa = new SmartAudi();
        sa.automaticDrive();
        sa.automaticParking();
        Audi aa = sa;
        aa.run();
        if (aa instanceof SmartAudi) {
            SmartAudi saa = ((SmartAudi)aa);
            saa.automaticParking();
            saa.automaticDrive();
        }
        Smart s = sa;
        s.automaticDrive();
        s.automaticParking();
    }
}
