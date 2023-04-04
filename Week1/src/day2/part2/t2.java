package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t2 {
    public static void main(String[] args) {
        /*2 键盘录入行号，打印对应行数的正方形，正方形里面放置&
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("正方形长度：");
        int LineNum = input.nextInt();
        for (int i = 0; i < LineNum; i++) {
            for (int j = 0; j < LineNum; j++) {
                System.out.print("&\t");
            }
            System.out.println();

        }
    }
}
