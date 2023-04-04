package day1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ccb
 **/
public class t8 {
    public static void main(String[] args) {
        /*
         *  T8(1)     十进制转二
         */
        Scanner input = new Scanner(System.in);
        System.out.println("输入十进制：");
        int t81 = input.nextInt();
        ArrayList l81 = new ArrayList();
        while (t81 != 0) {
            l81.add(t81 % 2);
            t81 = t81 / 2;
        }
        System.out.print("转化为二进制：");
        for (int i = l81.size() - 1; i >= 0; i--) {
            System.out.print(l81.get(i));
        }
        System.out.println("\n----------------");
        /*
         *  T8(1)     二进制转十
         */
        System.out.println("输入十进制：");
        String t82 = input.next();
        int n82 = 0;
        int t = 0;
        for (int i = t82.length(); i >0; i--) {
            if (t82.substring(i-1,i).equals("1")){
                n82 = n82 + (int)Math.pow(2, t);
            }
            t++;
        }
        System.out.println("转化为十进制：" + n82);
    }
}
