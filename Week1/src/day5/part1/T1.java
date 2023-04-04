package day5.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class T1 {
    /*1 键盘录入字符串，得到改字符串字母的个数*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T1 = sc.next();
        System.out.println(countLetter(T1));
    }
    public static int countLetter(String a){//统计字符串中字母个数
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char T1Char = a.charAt(i);
            if (Character.isLetter(T1Char)){
                count++;
            }
        }
        return count;
    }
}
