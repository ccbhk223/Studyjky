package day1.part2.T2;

/**
 * ccb
 **/
public class ServiceDao implements Service {
    /*2 封装接口Service,里面定义print和print1编写实现子类Dao实现print和print1最后实例化接口测试
     */
    @Override
    public void print() {
        System.out.println("我是print方法");
    }

    @Override
    public void print1() {
        System.out.println("我是print1方法");
    }

    public static void main(String[] args) {
        Service service = new ServiceDao();
        service.print();
        service.print1();
    }
}
