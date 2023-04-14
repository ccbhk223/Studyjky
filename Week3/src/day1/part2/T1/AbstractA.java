package day1.part2.T1;

/**
 * ccb
 **/
public abstract class AbstractA{
    /*1 封装抽象类A,里面定义抽象方法out和out1;编写实现子类实现out和out1的打印操作最后实例化A测试*/
    public abstract void out();
    public abstract void out1();

}

class AbstractAChlid extends AbstractA {


    @Override
    public void out() {
        System.out.println("我是out方法");
    }

    @Override
    public void out1() {
        System.out.println("我是out1方法");
    }

    public static void main(String[] args) {
        AbstractA abstractA = new AbstractAChlid();
        abstractA.out();
        abstractA.out1();
    }
}

