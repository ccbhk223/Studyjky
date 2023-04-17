package day4.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class T2 {
    /*2 键盘录入纯数字字符串，输入负数，那么将负数对应的值-1再输出；输入正数，就直接对其+1输出*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.matches("[-]?\\d+[.]?\\d*")) {
            if (str.matches("^[-]\\d+(\\.\\d+)?$")) {
                System.out.println(Double.parseDouble(str)-1);
            }else System.out.println(Double.parseDouble(str)+1);
        }else System.out.println("error");
    }
}
