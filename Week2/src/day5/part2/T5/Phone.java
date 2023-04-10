package day5.part2.T5;

/**
 * ccb
 **/
public class Phone {
    private  String PBrand;
    private  double PPrice;
    //methods
    public void call(String name){
        System.out.print("使用" +PPrice+
                "元的" +PBrand+
                "给"+name+"打电话");
    }
    //constructor

    public Phone() {
    }

    public Phone(String PBrand, double PPrice) {
        this.PBrand = PBrand;
        this.PPrice = PPrice;
    }
    //getter and setter

    public String getPBrand() {
        return PBrand;
    }

    public void setPBrand(String PBrand) {
        this.PBrand = PBrand;
    }

    public double getPPrice() {
        return PPrice;
    }

    public void setPPrice(double PPrice) {
        this.PPrice = PPrice;
    }
}
