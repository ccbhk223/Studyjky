package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T3 {
    /*3 定义方法完成得到某个数组中所有元素的和*/
    public static void main(String[] args) {
        int[] T3 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < T3.length; i++) {
            T3[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(T3));
        System.out.println(sumList(T3));
    }
    public  static int sumList(int[] a){
        int sum=0;
        for (int i :a
             ) {
            sum+=i;
        }
        return sum;
    }
}
