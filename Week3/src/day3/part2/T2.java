package day3.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class T2 {
    /*2 键盘录入数字字符串，将数字字符串拼接其位数的整型数值打印出来(假设字符串拼接后结果不超出整型范围)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            StringBuffer stringBuffer = new StringBuffer(sc.next());
            if (isDig(stringBuffer)) {
                System.out.println(myConcat(stringBuffer));
                break;
            }
        }
    }
    public static int myConcat(StringBuffer stringBuffer){
        stringBuffer.append(stringBuffer.length());
        return Integer.parseInt(stringBuffer+"");
    }
    public static boolean isDig(StringBuffer stringBuffer) {
        String string = new String(stringBuffer);
        if (!"".equals(string))
            return string.matches("^[0-9]*$");
        else
            return false;
    }
}
