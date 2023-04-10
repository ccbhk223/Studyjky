package day5.part2.T4;

/**
 * ccb
 **/
public class Phone {
    private  String PBrand;
    private  double PPrice;

    //constructor

    public Phone(String PBrand, double PPrice) {
        this.PBrand = PBrand;
        this.PPrice = PPrice;
    }

    //getter and setter;

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
