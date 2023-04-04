package day3.Part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t5 {
    /*5 键盘录入某个数值，要求将该数值范围内的数值和求出来，
    同时判断该数值是否是奇数
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t5 = input.nextInt();
        int sum= 0;
        for (int i = 1; i <= t5 ; i++) {
            sum+=i;
        }
        String a =(t5%2==0)?"偶":"奇";
        System.out.println("sum = " + sum +",这个数是"+a+"数");

    }
}
