package day2.part4.T4;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        ActedTiger t = new ActedTiger("黄色",2);
        ActedGorilla g = new ActedGorilla("黑色",3);
        ActedParrot p = new ActedParrot("绿色",1);
        ZooManager zm = new ZooManager("邓超", 30);
        zm.feed(t);
        zm.feed(g);
        zm.feed(p);
        zm.letItShow(t);
        zm.letItShow(g);
        zm.letItShow(p);
    }
}
