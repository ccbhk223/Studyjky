package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T11 {
    /*11 在课上代码基础上实现：将数值数组中次数出现偶数个的全部元素打印出来，格式为12出现4次：选做*/
    public static void main(String[] args) {
        int[] T11 = {2, 2, 12, 0, 5, 12, 12, 2, 0, 1, 12, 78, 3, 1};
        System.out.println("原数组" + Arrays.toString(T11));
        for (int i = 0; i < T11.length; i++) {//循环每个字符串
            int a = T11[i];
//            if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            boolean key = false;
            for (int k = 0; k < i; k++) {//判断是否之前出现过
                if (a == T11[k]) {
                    key = true;
                    break;
                }
            }
            if (!key) {
                int count = 0;
                for (int j = 0; j < T11.length; j++) {//计算字母次数
                    int b = T11[j];
                    if (a == b) count++;
                }
                if (count % 2 == 0) {
                    System.out.println(a + "\t有出现" + count + " 次 ");
                }
            }
        }
    }
}
