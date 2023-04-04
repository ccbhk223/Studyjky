package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T5 {
    /*5 定义方法完成数组的排序*/
    public static void main(String[] args) {
        int[] T5 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            T5[i] = (int) (Math.random() * 10);
        }
        System.out.println("原数组" + Arrays.toString(T5));
        DaoXu(T5);
    }
    public static void DaoXu(int[] a){//选择排序倒序
        for (int i = 0; i < a.length; i++) {
            int max =i;
            for (int j = i+1; j < a.length; j++) {
                if (a[max]<a[j])max=j;
            }
            if (max!=i){
                int t;
                t = a[i];a[i]=a[max];a[max]=t;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
