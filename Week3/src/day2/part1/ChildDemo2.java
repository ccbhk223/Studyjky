package day2.part1;

public class ChildDemo2 implements  ParentDemo{
    //独有的属性
    private int b=222;
    //constructor

    public ChildDemo2() {
    }
    //getter and setter

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ChildDemo2{" +
                "b=" + b +
                '}';
    }
}
