package day5.part2;

import java.util.Arrays;

/**
 * ccb
 **/
public class T6 {
    /*6 定义数组完成将数组中某个位置的元素修改为原数值拼接1比如12就变成121*/
    public static void main(String[] args) {
        int[] T6 = {45,564,15,33,1};
        System.out.println(Arrays.toString(T6));
        pinJie(T6,4,2564);
        System.out.println(Arrays.toString(T6));
    }
    public static void pinJie(int[] a,int b,int c){
        a[b] = a[b]*(int)(Math.pow(10,level(c)))+c;
    }
    public static int level(int a) {//识别数字多少位
        /*int l = 0;
        for (; a > 0; a /= 10) l++;
        return l;*/
        return  (""+a).length();
    }
}
