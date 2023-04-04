package day2.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t6 {
    public static void main(String[] args) {
        /*6 键盘录入学生性别，输入的是0那么就是男，输入的是1那么就是女；否则就是错误
        */
        Scanner input = new Scanner(System.in);
        int sex = input.nextInt();
        System.out.println((sex==0?"男":(sex==1?"女":"输入错误")));

    }
}
