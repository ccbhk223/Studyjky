package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T4 {
    /*4 定义方法完成删除数组中某个元素*/
    public static void main(String[] args) {
        int[] T2 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            T2[i] = (int) (Math.random() * 10);
        }
        System.out.println("原数组" + Arrays.toString(T2));
        int b = sc.nextInt();
        del(T2,b);
    }
    public static void del(int[] a,int b){
//        int index = Arrays.binarySearch(a,b);
        int key = 0;
        for (int i = 0; i < a.length - key; i++) {
            if (a[i] ==b) {
                int continueSmaller2 = 1, continueSmaller2Index = i;
                key++;
                while (continueSmaller2Index + 1 < a.length - key && a[continueSmaller2Index + 1] ==b) {
                    key++;
                    continueSmaller2++;
                    continueSmaller2Index++;
                }
                for (int j = i; j < a.length - key; j++) {
                    a[j] = a[j + continueSmaller2];
                }
                for (int j = 1; j <= key; j++) {
                    a[a.length - j] = 0;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        int[] tempList = new int[a.length - key];
        if (a.length - key >= 0) System.arraycopy(a, 0, tempList, 0, a.length - key);
//        Arrays.sort(tempList);
        System.out.println(Arrays.toString(tempList));
    }

}
