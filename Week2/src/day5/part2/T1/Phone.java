package day5.part2.T1;

/**
 * ccb
 **/
public class Phone {
    private String HBrand;
    //methods
    public String playGame(){
        return "玩游戏";
    }
    //constructor
    public Phone(String HBrand) {
        this.HBrand = HBrand;
    }

    public Phone() {
    }

    //getter and setter
    public String getHBrand() {
        return HBrand;
    }

    public void setHBrand(String HBrand) {
        this.HBrand = HBrand;
    }
}
