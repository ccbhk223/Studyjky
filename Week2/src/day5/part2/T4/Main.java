package day5.part2.T4;

/**
 * ccb
 **/
public class Main {
    public static void main(String[] args) {
        Person p = new Person("小王");
        System.out.println(p.getPName()+"卖出一部" +p.sellPhone().getPPrice()+
                "元的" +p.sellPhone().getPBrand()
                );
    }
}
