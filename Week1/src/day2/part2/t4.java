package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t4 {
    public static void main(String[] args) {
        /*4  键盘录入某个数，求某个数范围内的所有乘积并且打印
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个数");
        int t41 = input.nextInt();
        System.out.println("输入第二个数");
        int t42 = input.nextInt();
        int max = Math.max(t41,t42),min = Math.min(t41,t42),mun=1;
        for (int i = min; i < max; i++) {
            mun = mun*i;
        }
        System.out.println("mun = " + mun);

    }
}
