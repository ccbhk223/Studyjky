package day2.part4.T2;

/**
 * ccb
 **/
public class Pad implements PlayGame {
    private String brand;
    private double price;
    //methods
    @Override
    public void playGame() {
        System.out.println("在使用" + price +
                " 元 " + brand +
                " 的IPad平板 " +
                " 玩游戏");
    }
    public void listenMusic(){
        System.out.println("在使用" + price +
                " 元 " + brand +
                " 的IPad平板 " +
                " 听音乐");
    }
    //constructor

    public Pad(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Pad() {
    }

    //get set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
