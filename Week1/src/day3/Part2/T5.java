package day3.Part2;

import java.util.Random;

/**
 * ccb
 **/
public class T5 {
    /*5 定义一个数组存放5个无规律数值，通过普通for循环和forEach将数组中所有的偶数打印出来
    * */
    public static void main(String[] args) {
        Random random = new Random();
        int[] T5 = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(1000);
            T5[i] =number;
        }
        for (int i :T5      //输出数组
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (T5[i]%2==0){
                System.out.print(T5[i]+" ");
            }
        }
        System.out.println();
        for (int i:T5
             ) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
