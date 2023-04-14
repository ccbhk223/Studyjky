package day2.part4.T5;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        AdminStaff adminStaff = new AdminStaff("001","ccb",10001);
        AdminStaff adminStaff1 = new AdminStaff("001","bbc",9001);
        adminStaff.work();
        adminStaff1.work();
        adminStaff.dance();
        adminStaff1.dance();

    }
}
