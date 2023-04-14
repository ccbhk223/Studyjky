package day3.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class T1 {
    /*1 键盘录入数字字符串，删除字符5之后的任意字符，如果5是最后一个字符则不用删除*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            StringBuffer stringBuffer = new StringBuffer(sc.next());
            if (isDig(stringBuffer)) {
                myDel(stringBuffer);
                System.out.println(stringBuffer);
                break;
            }
        }
    }

    public static void myDel(StringBuffer stringBuffer) {
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
            char c = stringBuffer.charAt(i);
            if (c == '5') {
                if (i + 1 == stringBuffer.length() - 1) {
                    if (stringBuffer.charAt(i + 1) != '5') {
                        stringBuffer.delete(i + 1, i + 2);
                    } else continue;
                }
                stringBuffer.delete(i + 1, i + 2);
            }
        }//55566656
    }

    public static boolean isDig(StringBuffer stringBuffer) {
        String string = new String(stringBuffer);
        if (!"".equals(string))
            return string.matches("^[0-9]*$");
        else
            return false;
    }
}
