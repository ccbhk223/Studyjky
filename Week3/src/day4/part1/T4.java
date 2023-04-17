package day4.part1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * ccb
 **/
public class T4 {
    /*4 通过Math类实现键盘录入整数，输出整数的3次幂；键盘录入的是小数输出小数的向下取整*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double cbtB = Math.cbrt(i);
        System.out.println(cbtB);
        System.out.println(Math.floor(cbtB));
    }
}
