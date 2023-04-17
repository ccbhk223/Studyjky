package day5;

import java.util.Scanner;

/**
 * ccb
 **/

public class T3 {
    /*# 3 键盘录入字符串，如果输入字符串不是0也不是1那么方法体内抛出MyException实现错误信息打印*/
    public static void main(String[] args) {
        try {
            MyException myException = new MyException();
            Scanner sc = new Scanner(System.in);
            String key = sc.next();
            if (key.equals("1") || key.equals("0")) {
                System.out.println("无事发生");
            } else throw myException;
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
