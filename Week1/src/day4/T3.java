package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T3 {
    /*3 定义一个数字数组，将数组中次数出现偶数位的数字修改为原数字的位数放入，通过forEach循环打印*/
    public static void main(String[] args) {
        int[] T3 = {111, 111, 3, 3,2222, 1, 66, 66, 2222, 2222, 2222, 4, 4, 4};//111, 111, 3, 3, 1, 66, 66, 2222, 2222, 2222, 2222, 4,4,4
        boolean[] T3Revised = new boolean[T3.length];//T3的第x位数是否被改动
        System.out.println("原数组" + Arrays.toString(T3));
        for (int i = 0; i < T3.length ; i++) {
            if(T3Revised[i]){
                continue;
            }
            int number = T3[i];
            int count = 0;
            boolean key = false;
            for (int k = 0; k < i; k++) {//判断是否之前出现过
                if (T3Revised[k]) {
//                    key = true;
                    continue;
                } else if (number == T3[k]) {
                    key = true;
                    break;
                }
            }
            if (!key) {
                for (int b = 0; b < T3.length; b++) {
                    if (number == T3[b] && !T3Revised[b]) count++;
               }
                System.out.println(number + "have"+count);
//                System.out.println(number + " have " + count);
                if (count % 2 == 0) {
                    for (int j = 0; j < T3.length; j++) {
                        int numberLevel = level(number);
                        if (T3[j] == number && !T3Revised[j]) {
                            T3[j] = numberLevel;
                            T3Revised[j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(T3));
        System.out.println(Arrays.toString(T3Revised));
    }

    public static int level(int a) {//识别数字多少位
        int l = 0;
        for (; a > 0; a /= 10) l++;
        return l;
//        return  (""+a).length();
    }
}
