package day2.part4.T2;

/**
 * ccb
 **/
public class SmartPhone extends Phone implements PlayGame {
    //constructor
    public SmartPhone() {
    }

    public SmartPhone(String brand, double price) {
        super(brand, price);
    }

    //methods
    @Override
    public void playGame() {
        System.out.println("在使用" + super.getPrice() +
                " 元 " + super.getBrand() +
                " 手机 " +
                "玩游戏");
    }

}
