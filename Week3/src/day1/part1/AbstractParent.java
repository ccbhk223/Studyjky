package day1.part1;

import java.util.Timer;

/**
 * ccb
 **/
public abstract class AbstractParent {
    String name="ccb";

    public abstract void in();

    void in1() {
        System.out.println("123");
    }


}

class AbstractChild extends AbstractParent {


    @Override
    public void in() {
        System.out.println("抽象方法"+super.name);
    }
    public static void main(String[] args) {
        AbstractParent abstractParent = new AbstractChild();
        abstractParent.in();
        abstractParent.in1();
        AbstractParent abstractParent1 = new AbstractParent() {
            @Override
            public void in() {
                System.out.println("匿名");
            }
        };
        abstractParent1.in();
        abstractParent1.in1();
        Timer timer = new Timer();

    }
}
