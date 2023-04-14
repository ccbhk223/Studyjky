package day3.part1.T2;

import java.util.Scanner;

/**
 * ccb
 **/
public class isHuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字：");
            String str = sc.nextLine();
            if (isDig(str)){
                StringBuffer stringBuffer = new StringBuffer(str);
                System.out.println(new String(stringBuffer.reverse()).equals(str)?"是回文":"不是回文");
                break;
            }
        }


    }
    public static boolean isDig(String string){
        if (string != null && !"".equals(string))
            return string.matches("^[0-9]*$");
        else
            return false;
    }
}
