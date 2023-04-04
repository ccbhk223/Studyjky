package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T2 {
    /*2 定义方法完成判断某个数组中某个元素是否出现过*/
    public static void main(String[] args) {
        int[] T2 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            T2[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(T2));
        if(isHave(T2)){
            System.out.println("yes");
        }else System.out.println("no");
//        System.out.print("数字：");
//        int key = sc.nextInt();
//        if ()
    }

    public static boolean isHave(int[] a) {
        boolean key=false;
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < i; k++) {//判断是否之前出现过
                if (a[i] == a[k]) {
                    System.out.println("数字"+a[i]+"在第"+(k+1)+"个位置出现过");
                    return !key;
                }
            }
        }

        return key;
    }
}
