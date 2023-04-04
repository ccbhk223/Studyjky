package day5.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class T2 {
    /* 2 键盘录入字符串表示人名，要求人名中不能出现字母：标记*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T2 = sc.next();
        if (HaveLetter(T2)){
            System.out.println("人名:"+T2+" 输入格式正确");
        }else System.out.println("格式错误");
    }
    public static boolean HaveLetter(String a){
        boolean key=false;
        char[] s = a.toCharArray();
        for (char i:s
             ) {
            if (i>='A'&&i<='Z'||i>='a'&&i<='z'){
                return key;
            }
        }
        return true;
    }
}
