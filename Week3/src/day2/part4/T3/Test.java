package day2.part4.T3;

/**
 * ccb
 **/
public class Test {
    public static void goToSport(Sport sport) {
        sport.playBasketball();
    }
    public static void goToRestaurant(Person person) {
        person.eat();
    }

    public static void main(String[] args) {
        SportTeacher sp = new SportTeacher("周晓斌",30);
        SportStudent ss = new SportStudent("叶知秋",18);
        Test.goToSport(ss);
        Test.goToSport(sp);
        Test.goToRestaurant(ss);
        Test.goToRestaurant(sp);
    }
}
