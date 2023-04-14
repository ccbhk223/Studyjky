package day3.part1.T3;

import java.util.Scanner;

/**
 * ccb
 **/
public class addOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            StringBuffer stringBuffer = new StringBuffer(sc.next());
            if (isDig(stringBuffer)){
                System.out.println(SBaddOne(stringBuffer));
                break;
            }
        }
    }
    public static StringBuffer SBaddOne(StringBuffer stringBuffer){
        String str = new String(stringBuffer);
        StringBuffer newStringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int c = Integer.parseInt(str.charAt(i)+"")+1;
            newStringBuffer.append(c);
        }
        return newStringBuffer;
    }
    public static boolean isDig(StringBuffer stringBuffer){
        String string = new String(stringBuffer);
        if (!"".equals(string))
            return string.matches("^[0-9]*$");
        else
            return false;
    }
}
