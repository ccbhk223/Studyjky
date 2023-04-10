package day5.part3;

public class SingltonDemo {
    private String name;

    //成员变量：就是它自己
    private SingltonDemo() {
        System.out.println("实例化一个对象");
    }

    /*static SingltonDemo single = null;*/
    private static volatile SingltonDemo instance = null;

    //定义一个方法创建或者产生对象
/*    public static SingltonDemo newInstance(){
        if(single == null) {
            single = new SingltonDemo();
        }
        return  single;
    }*/
    public static SingltonDemo getInstance() {
        if (instance == null) {
            synchronized (SingltonDemo.class) {
                if (instance == null) {
                    instance = new SingltonDemo();
                }
            }
        }
        return instance;
    }
    //toString

    @Override
    public String toString() {
        return "SingltonDemo{" +
                "name='" + name + '\'' +
                '}';
    }
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
