package day2.part4.T3;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager("ccb", "m001", 1000, 100);
        Manager manager2 = new Manager();
        manager2.setMName("bbc");
        manager2.setMID("m002");
        manager2.setMSalary(1001);
        manager2.setMBonus(105);
        Coder coder1 = new Coder("hk", "c001", 500);
        Coder coder2 = new Coder();
        coder2.setCName("kh");
        coder2.setCID("c002");
        coder2.setCSalary(600);
        manager1.MWork();
        manager2.MWork();
        coder1.CWork();
        coder2.CWork();
    }
}
