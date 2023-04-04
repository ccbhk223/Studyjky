package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T6 {
    /*6 给定数字数组，删除所有的2后对数组进行从大到小数值的打印*/
    public static void main(String[] args) {
        int[] a = {2,2,2, 45, 5, 2, 0, 1, 78, 30, 1};
        int key = 0;
        System.out.println("原数组"+Arrays.toString(a));
        for (int i = 0; i < a.length - key; i++) {
            if (a[i] == 2) {
                key++;
                for (int j = i; j < a.length - key; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - key] = 0;
                i--;
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println("删除2后数组"+Arrays.toString(a));
        int[] b = new int[a.length - key];
        if (a.length - key >= 0) System.arraycopy(a, 0, b, 0, a.length - key);
        System.out.print("倒序后数组");
        DaoXu(b);
    }
    private static void DaoXu(int[] a){//选择排序倒序
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
