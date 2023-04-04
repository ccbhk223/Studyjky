package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t3 {
    public static void main(String[] args) {
        /*3 键盘录入行号，打印对应行的金字塔
        * */
        Scanner in  = new Scanner(System.in);
        System.out.println("金字塔层数：");
        int n = in.nextInt();
        char c = 65;
        for (int i = 1; i <=n ; i++) {//表示行数
            for (int j = 0; j <n-i;j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <2*i-1; j++) {//打印星星
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
