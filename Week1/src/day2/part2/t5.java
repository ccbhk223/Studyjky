package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t5 {
    public static void main(String[] args) {
        /*5 键盘录入某个数，求某个数范围内的所有乘积并且打印，格式如下：1*2*3*4*5*6*7...=结果
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个数");
        int t51 = input.nextInt();
        System.out.println("输入第二个数");
        int t52 = input.nextInt();
        int max = Math.max(t51,t52),min = Math.min(t51,t52),mun = 1;
        StringBuilder txt = new StringBuilder();
        for (int i = min; i < max; i++) {
            mun = mun*i;
        }
        for (int i = min; i < max; i++) {
            txt.append(i).append(" * ");
        }
        System.out.println(txt.substring(0,txt.length()-3)+" = " + mun);
    }
}
