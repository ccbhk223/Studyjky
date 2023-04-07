package day4.part3.T2;

/**
 * ccb
 **/
public class Equip {
    private String ENmame;
    private int ELevel;
    private String EColor;//装备颜色
    private  String EKind;//装备种类
    private  double EATK;//装备攻击力
    private  double EDEF;//装备防御力

    //构造装备

    public Equip(String ENmame, int ELevel, String EColor, String EKind, double EATK, double EDEF) {
        this.ENmame = ENmame;
        this.ELevel = ELevel;
        this.EColor = EColor;
        this.EKind = EKind;
        this.EATK = EATK;
        this.EDEF = EDEF;
    }

    //toString
    @Override
    public String toString() {
        return "装备名：" +ENmame+","+
                "装备等级：" +ELevel+","+
                "装备品级：" +EColor+","+
                "装备种类：" +EKind+","+
                "攻击力：" +EATK+","+
                "防御力：" +EDEF+
                "";
    }


    //getter and setter
    public String getENmame() {
        return ENmame;
    }

    public void setENmame(String ENmame) {
        this.ENmame = ENmame;
    }

    public int getELevel() {
        return ELevel;
    }

    public void setELevel(int ELevel) {
        this.ELevel = ELevel;
    }

    public String getEColor() {
        return EColor;
    }

    public void setEColor(String EColor) {
        this.EColor = EColor;
    }

    public String getEKind() {
        return EKind;
    }

    public void setEKind(String EKind) {
        this.EKind = EKind;
    }

    public double getEATK() {
        return EATK;
    }

    public void setEATK(double EATK) {
        this.EATK = EATK;
    }

    public double getEDEF() {
        return EDEF;
    }

    public void setEDEF(double EDEF) {
        this.EDEF = EDEF;
    }
}
