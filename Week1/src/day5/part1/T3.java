package day5.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class T3 {
    /* 3 键盘录入密码，要求必须是纯数字6位*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T2 = sc.next();
        System.out.println(isSix(T2));
    }
    public static String isSix(String a){
        if (a.length()==6){
            for (int i = 0; i < a.length(); i++) {
                char s = a.charAt(i);
                if (s>='0'&&s<='9') return "合格密码";
            }
            return "密码不为6位或者不是纯数字";
        }
        return "密码不为6位或者不是纯数字";
    }
}
