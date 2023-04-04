package day3.Part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class T6 {
    /*6 定义一个数组存放键盘录入的6个数值，通过forEach打印所有的素数:选做
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] T6 = new int[6];
        for (int i = 0; i < 6; i++) {
            int a =in.nextInt();
            T6[i] = a;
        }
        for (int i :T6      //输出数组
        ) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:T6) {
            int j=2;
            for (; j <= Math.sqrt(i); j++) {
                if (i% j == 0) break;
            }
            if (j > Math.sqrt(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
