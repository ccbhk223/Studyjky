package day2.part4.T2;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        Phone njy = new Phone("诺基亚",100);
        njy.call("景甜");
        njy.sendMessage("景甜");
        SmartPhone sp = new SmartPhone("华为", 3000);
        sp.call("林思意");
        sp.sendMessage("林思意");
        sp.playGame();
        Pad p = new Pad("IPad", 2000);
        p.listenMusic();
        p.playGame();
    }
}
