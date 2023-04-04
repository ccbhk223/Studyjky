package day3.Part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t1 {
    /*1 键盘录入A-Z范围内的字符，输入对应的小写
    * */
    public static void main(String[] args) {
        System.out.println("输入一个大写字母：");
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        System.out.println((char) (a+32));
    }
}
