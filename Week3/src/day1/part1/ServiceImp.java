package day1.part1;

/**
 * ccb
 **/
public class ServiceImp implements ServiceDao {

    @Override
    public void input() {
        System.out.println("我调用了接口");
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ServiceDao serviceImp = new ServiceImp();
        serviceImp.input();
        System.out.println(serviceImp.getName());
    }
}