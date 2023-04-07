package day4.part3.T2;

/**
 * ccb
 **/
public class GameMianApp {
    public static void main(String[] args) {
        Equip equip1 = new Equip("大刀",1,"史诗","  刀",10,0);
        Equip equip2 = new Equip("红手套",1,"普通","手套",0,1);
        Equip equip3 = new Equip("胸甲",1,"稀有","衣服",0,2);
        Equip equip4 = new Equip("钢盔",1,"普通","头盔",0,5);
//        System.out.println(equip1);
//        System.out.println(equip2);
//        System.out.println(equip3);
//        System.out.println(equip4);
        Hero hero1 = new Hero("ccb",10,20000,50,5,"人族");
        Monster monster1 = new Monster("哥布林",10,200,20,70,"兽族");
        System.out.println(hero1);
        hero1.addEquip(equip1);
        hero1.addEquip(equip2);
        hero1.addEquip(equip3);
        hero1.addEquip(equip4);
        Equip[] equip = hero1.getEquips();
        System.out.println("英雄目前装备：");
        if (equip!=null){
            for (int i = 0; i < hero1.getEquipCount(); i++) {
                System.out.println(equip[i]);
            }
        }else System.out.println("装备为空");
        System.out.println(hero1);
        System.out.println(monster1);
        System.out.println("———————————————战斗开始！———————————————");
        while (!hero1.isDead()&&!monster1.isDead()){
            hero1.HAttack(monster1);
            if (monster1.isDead()){
                System.out.println(monster1.getMName()+"阵亡，游戏结束！");
                break;
            }
            monster1.MAttack(hero1);
            if (hero1.isDead()){
                System.out.println(hero1.getHName()+"阵亡，游戏结束！");
                break;
            }
        }
    }
}
