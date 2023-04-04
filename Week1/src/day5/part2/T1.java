package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T1 {
    /*1 定义方法完成数组中某个元素出现出现次数的统计*/
    public static void main(String[] args) {
        int[] T1 = new int[10];
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            T1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(T1));
        System.out.println(key+"出现了"+countNumber(T1,key));

    }

    public static int countNumber(int[] a, int b) {//统计元素b在数组出现的次数
        int count = 0;
        for (int value : a) {
            if (value == b) count++;
        }
        return count;
    }
}