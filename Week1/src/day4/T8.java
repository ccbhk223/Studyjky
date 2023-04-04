package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T8 {
    /*8 给定数值数组，将数组中所有大于89的全部全部从小到大排序，其他元素位置不变，最后通过Arrays.toString方法将其打印出来*/
    public static void main(String[] args) {
        int[] T8 = {50, 90, 88, 66, 92, 100, 66, 15};
        System.out.println("原数组"+Arrays.toString(T8));
        int[] T8Bigger90 = new int[T8.length];
        DaoXuBigger90(T8);
    }

    private static void DaoXuBigger90(int[] a) {//选择排序倒序
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 89) {
                int max = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > 89)
                        if (a[max] < a[j]) max = j;
                }
                if (max != i) {
                    int t;
                    t = a[i];
                    a[i] = a[max];
                    a[max] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
