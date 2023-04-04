package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t9 {
    public static void main(String[] args) {
        /* 键盘录入某个数，打印某个数范围内的所有水仙花数（选做）
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个数");
        int t91 = input.nextInt();
        System.out.println("输入第二个数");
        int t92 = input.nextInt();
        int max = Math.max(t91, t92), min = Math.min(t91, t92);
        System.out.println("水仙花数有：");
        for (int i = min; i < max; i++) {
            int m = level(i), sum = 0, n = i;
            while (n != 0) {
                sum = sum + (int) Math.pow(n % 10, m);
                n /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
    public static int level(int a){
        int count=0;
        while(a!=0){
            count++;
            a/=10;
        }
        return count;
    }
}

