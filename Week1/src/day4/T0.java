package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T0 {
    /*0 将数值  1,2,3,4     45,45,12,0    56,67,78,90,12放入二维数组
   将二维数组中每个一维数组的信息从大到小排序后打印出来
    */
    public static void main(String[] args) {
        int[][] T0={{1,2,3,4},{45,45,12,0},{56,67,78,90,12}};
        for (int i = 0; i < T0.length ; i++) {
            DaoXu(T0[i]);
        }
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
