package day5.part2.T7;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.VWheel = 4;
        car.VColor = "白色";
        car.run();
        car.addGasoline();
        ElectricBicycle electricBicycle = new ElectricBicycle();
        electricBicycle.VWheel = 2;
        electricBicycle.VColor = "黑色";
        electricBicycle.run();
        electricBicycle.charge();
    }
}
