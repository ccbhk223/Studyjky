package day3.Part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t2 {
    /*2  键盘录入某个数值，打印该数值的位数
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t2 = input.nextInt(),count=0;
        for (;t2>0;t2/=10)count++;
        System.out.println("count = " + count);
    }
}
