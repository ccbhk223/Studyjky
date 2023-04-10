package day5.part2.T8;

/**
 * ccb
 **/
public class Person {
    private int PAge;
    private String PName;
    //methods
    public void wash(Clothes clothes){
        System.out.println(PAge+"岁的" +PName+
                "正在洗一件" +clothes.getCColor()+
                "的" +clothes.getCBrand()+
                "牌的衣服");

    }
    //constructor

    public Person(int PAge, String PName) {
        this.PAge = PAge;
        this.PName = PName;
    }
    //getter and setter

    public int getPAge() {
        return PAge;
    }

    public void setPAge(int PAge) {
        this.PAge = PAge;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }
}
class Clothes{
    private String CBrand;
    private String CColor;
    //constructor
    public Clothes(String CBrand, String CColor) {
        this.CBrand = CBrand;
        this.CColor = CColor;
    }

    //getter and setter

    public String getCBrand() {
        return CBrand;
    }

    public void setCBrand(String CBrand) {
        this.CBrand = CBrand;
    }

    public String getCColor() {
        return CColor;
    }

    public void setCColor(String CColor) {
        this.CColor = CColor;
    }
}
