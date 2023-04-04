package day2.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t4 {
    public static void main(String[] args) {
        /*4 键盘录入一个学生的年龄，年龄是偶数打印年龄是偶数，否则打印年龄是奇数
        */
        Scanner input = new Scanner(System.in);
        int name = input.nextInt();
        System.out.println(name%2==1?"年龄是奇数":"年龄是偶数");
    }
}
