package day5.part3;

public class SinltonDemoTest {
    public static void main(String[] args) {
        SingltonDemo sinltonDemo = SingltonDemo.getInstance();
        SingltonDemo sinltonDemo1 = SingltonDemo.getInstance();
        sinltonDemo.setName("aaa");
        sinltonDemo1.setName("bbb");
        System.out.println(sinltonDemo);
        System.out.println(sinltonDemo1);
        if (sinltonDemo == sinltonDemo1){
            System.out.println("他们是同一个对象");
        }else System.out.println("他们不是同一个对象");
    }
}
