package day4.part3.T2;

/**
 * ccb
 **/
public class Hero {
    private String HName;
    private int HLevel;
    private double HHP;//英雄血量
    private double HATk;//英雄攻击力
    private double HDEF;//英雄防御力
    private String HKind;//英雄种族
    private Equip[] equips;//英雄装备
    private int equipCount=0;//英雄现有装备数


    //方法
    public void HAttack(Monster m) {//Hero attack Monster
        double DMG = this.HATk;
        if (Math.random()<=0.2){
            DMG = DMG*2-m.getMDEF();
            if (DMG>0){
                m.setMHP(m.getMHP()-DMG);
                System.out.println(this.HName+" 对 "+m.getMName()+" 触发暴击造成了 "+DMG+" 点伤害！");
                System.out.println("怪兽 "+m.getMName()+" 血量："+m.getMHP());
            }else {
                System.out.println("未能击穿敌人护甲！");
                System.out.println("怪兽 "+m.getMName()+" 血量："+m.getMHP()+"没有变化");
            }
        }else {
            DMG = DMG-m.getMDEF();
            if (DMG>0){
                m.setMHP(m.getMHP()-DMG);
                System.out.println(this.HName+" 对 "+m.getMName()+" 普通攻击造成了 "+DMG+" 点伤害");
                System.out.println("怪兽 "+m.getMName()+" 血量："+m.getMHP());
            }else {
                System.out.println(this.HName+"的普通攻击未能击穿敌人护甲！");
                System.out.println("怪兽 "+m.getMName()+" 血量："+m.getMHP()+"没有变化");
            }
        }
    }

    public void addEquip(Equip equip) {//Hero add equip
        if (this.equipCount<3){
            equips[equipCount] = equip;
            this.equipCount++;
            this.HATk = this.HATk+equip.getEATK();
            this.HDEF = this.HDEF+equip.getEDEF();
            System.out.println("装备上了"+equip.getENmame()+"!"+"攻击力提升 "+equip.getEATK()+" ,防御力提升 "+equip.getEDEF()+"!");
        }else {
            System.out.println("装备"+equip.getENmame()+"失败，装备数量已达上限，无法装备");
        }
    }

    public boolean isDead() {// is Hero dead
        return this.HHP <= 0;
    }

    //构造Hero

    public Hero(String HName, int HLevel, double HHP, double HATk, double HDEF, String HKind) {
        this.HName = HName;
        this.HLevel = HLevel;
        this.HHP = HHP;
        this.HATk = HATk;
        this.HDEF = HDEF;
        this.HKind = HKind;
        this.equips = new Equip[3];
    }
    //toString
    @Override
    public String toString() {
        return "英雄昵称：" +HName+","+
                "等级：" +HLevel+","+
                "HP：" +HHP+","+
                "ATK" +HATk+","+
                "DEF" +HDEF+","+
                "种类:"+HKind;
    }

    //getter and setter

    public int getEquipCount() {
        return equipCount;
    }

    public void setEquipCount(int equipCount) {
        this.equipCount = equipCount;
    }

    public String getHName() {
        return HName;
    }

    public void setHName(String HName) {
        this.HName = HName;
    }

    public int getHLevel() {
        return HLevel;
    }

    public void setHLevel(int HLevel) {
        this.HLevel = HLevel;
    }

    public double getHHP() {
        return HHP;
    }

    public void setHHP(double HHP) {
        this.HHP = HHP;
    }

    public double getHATk() {
        return HATk;
    }

    public void setHATk(double HATk) {
        this.HATk = HATk;
    }

    public double getHDEF() {
        return HDEF;
    }

    public void setHDEF(double HDEF) {
        this.HDEF = HDEF;
    }

    public String getHKind() {
        return HKind;
    }

    public void setHKind(String HKind) {
        this.HKind = HKind;
    }

    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }
}
