package day4.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class T5 {
    /*5 使用正则表达式完成以下内容

   1 键盘录入学生学号，要求姓名中只要包含数字就可以，否则重新输入

   2 键盘录入学生密码，要求密码必须是纯数字6位，否则重新输入

   3 键盘录入学生姓名，要求只能由数字字母,_组成，否则重新输入

   4 键盘录入学生年龄，要求只能是2位-3位之间的纯数字，否则重新输入
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {//学生学号判断
            System.out.println("学生学号：(名中只要包含数字)");
            String No = sc.next();
            if (No.matches("[\\w\\W]*\\d[\\w\\W]*")) {//姓名中只要包含数字
                System.out.println("输入格式正确");
                break;
            }else System.out.println("格式错误");
        }
        while (true) {//学生密码判断
            System.out.println("学生密码：(必须是纯数字6位)");
            String pwd = sc.next();
            if (pwd.matches("\\d{6}")) {//必须是纯数字6位
                System.out.println("输入格式正确");
                break;
            }else System.out.println("格式错误");
        }
        while (true) {//学生姓名判断
            System.out.println("学生姓名：(只能由数字字母,_组成)");
            String name = sc.next();
            if (name.matches("^[\\d|_]*$")) {//只能由数字字母,_组成
                System.out.println("输入格式正确");
                break;
            }else System.out.println("格式错误");
        }
        while (true) {//学生年龄判断
            System.out.println("学生年龄：(只能是2位-3位之间的纯数字)");
            String age = sc.next();
            if (age.matches("^\\d{2,3}$")) {//只能是2位-3位之间的纯数字
                System.out.println("输入格式正确");
                break;
            }else System.out.println("格式错误");
        }
    }
}
