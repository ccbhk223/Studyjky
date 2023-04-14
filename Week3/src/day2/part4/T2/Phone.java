package day2.part4.T2;

/**
 * ccb
 **/
public class Phone {
    private String brand;
    private double price;


    //methods
    public void call(String name) {
        System.out.println("在使用" +price+
                " 元 " +brand+
                " 手机 给 " +name+
                " 打电话");
    }
    public void sendMessage(String name) {
        System.out.println("在使用" +price+
                " 元 " +brand+
                " 手机 给 " +name+
                " 发短信");
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
    //constructor

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
}
