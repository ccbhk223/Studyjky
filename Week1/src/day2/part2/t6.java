package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t6 {
    public static void main(String[] args) {
        /*6 键盘录入某个数，判断某个数是否是素数，如果是打印是素数，如果不是打印不是素数（选做）
         * */
        while (true) {
            Scanner num = new Scanner(System.in);
            int a = num.nextInt(), i = 2;
            if (a == 0 || a == 1) {//输入1或0推出
                break;
            }
            for (; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(a)) {
                System.out.println("是素数");
            } else {
                System.out.println("不是素数");
            }
        }
    }
}
