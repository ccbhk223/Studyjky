package day2.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t3 {
    public static void main(String[] args) {
        /*3 键盘输入一个学生的姓名，使用三木运算符判断姓名是否等于wangwu，
            是打印wangwu;否则打印"error"
        */
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name.equals("wangwu")?"wangwu":"error");
    }
}
