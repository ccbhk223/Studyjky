package day2.part1;

public class ChildDemo implements ParentDemo{//子类
    //独有的属性
    private int a=111;
    //constructor

    public ChildDemo() {
    }
    //getter and setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "ChildDemo{" +
                "a=" + a +
                '}';
    }
    //独有行为
    public void out(){
        System.out.println("这个方法只有我有");
    }
}
