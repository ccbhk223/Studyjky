package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T7 {
    /*7 键盘录入5个数值，将5个数值放入数组同时将其和随机数产生的4个数值进行合并到新数组，同时将新数组中所有的偶数修改为比其大一的奇数*/
    public static void main(String[] args) {
        int[] T7 = new int[5];
        int[] T7Ran = new int[4];
        int[] T7Rex = new int[T7.length + T7Ran.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入5个数值：");
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            T7[i] = a;
            T7Rex[i] = a;
        }
        System.out.println("原数组" + Arrays.toString(T7));
        for (int i = 0; i < 4; i++) {
            int RandomNum = (int) (Math.random() * 100);
            T7Ran[i] = RandomNum;
            T7Rex[T7.length + i ] = RandomNum;
        }
        System.out.println("随机数数组" + Arrays.toString(T7Ran));
        System.out.println("组合数组" + Arrays.toString(T7Rex));
        for (int i = 0; i <T7Rex.length ; i++) {
            if (T7Rex[i]%2==0)T7Rex[i]++;
        }
        System.out.println("组合数组修改后" + Arrays.toString(T7Rex));

    }
}
