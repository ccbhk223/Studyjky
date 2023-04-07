package day4.part3.T2;

/**
 * ccb
 **/
public class Monster {
    private String MName;
    private int MLevel;
    private double MHP;
    private double MATK;
    private double MDEF;
    private  String MKind;

    //方法
    public void MAttack(Hero h){// Monster attack Hero
        double DMG = this.MATK;
        DMG = DMG-h.getHDEF();
        if (DMG>0){
            h.setHHP(h.getHHP()-DMG);
            System.out.println(this.MName+" 对 "+h.getHName()+" 普通攻击造成了 "+DMG+" 点伤害");
            System.out.println("英雄 "+h.getHName()+" 血量："+h.getHHP());
        }else {
            System.out.println("怪物 "+this.MName+"的普通攻击未能击穿对方护甲！");
            System.out.println("英雄 "+h.getHName()+" 血量："+h.getHHP()+"没有变化");
        }
    }
    public boolean isDead() {// is Hero dead
        return this.MHP <= 0;
    }
    //构造Monster

    public Monster(String MName, int MLevel, double MHP, double MATK, double MDEF, String MKind) {
        this.MName = MName;
        this.MLevel = MLevel;
        this.MHP = MHP;
        this.MATK = MATK;
        this.MDEF = MDEF;
        this.MKind = MKind;
    }
    //toString
    @Override
    public String toString() {
        return "怪兽昵称：" +MName+", "+
                "等级：" +MLevel+", "+
                "HP：" +MHP+", "+
                "ATK：" +MATK+", "+
                "DEF：" +MDEF+", "+
                "种类："+MKind;
    }

    //getter and setter
    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public int getMLevel() {
        return MLevel;
    }

    public void setMLevel(int MLevel) {
        this.MLevel = MLevel;
    }

    public double getMHP() {
        return MHP;
    }

    public void setMHP(double MHP) {
        this.MHP = MHP;
    }

    public double getMATK() {
        return MATK;
    }

    public void setMATK(double MATK) {
        this.MATK = MATK;
    }

    public double getMDEF() {
        return MDEF;
    }

    public void setMDEF(double MDEF) {
        this.MDEF = MDEF;
    }

    public String getMKind() {
        return MKind;
    }

    public void setMKind(String MKind) {
        this.MKind = MKind;
    }
}
