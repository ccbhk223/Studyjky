package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T2_2 {
    /*2 定义一个数字数组，将数组中所有出现次数小于2的数值全部删除，最后从小到大排序打印
     * */
    public static void main(String[] args) {
        int[] T2 = {2, 5, 1, 1, 1, 10, 1, 78, 3, 1};
        int key = 0;
        System.out.println("原数组" + Arrays.toString(T2));
        for (int i = 0; i < T2.length - key; i++) {
            if (T2[i] < 2) {
                int continueSmaller2 = 1, continueSmaller2Index = i;
                key++;
                while (continueSmaller2Index + 1 < T2.length - key && T2[continueSmaller2Index + 1] < 2) {
                    key++;
                    continueSmaller2++;
                    continueSmaller2Index++;
                }
                for (int j = i; j < T2.length - key; j++) {
                    T2[j] = T2[j + continueSmaller2];
                }
                for (int j = 1; j <= key; j++) {
                    T2[T2.length - j] = 0;
                }
            }
            System.out.println(Arrays.toString(T2));
        }
        System.out.println("------");
//        System.out.print(Arrays.toString(T2));
        int[] b = new int[T2.length - key];
        if (b.length >= 0) System.arraycopy(T2, 0, b, 0, b.length);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
