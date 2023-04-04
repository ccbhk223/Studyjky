package day2.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t5 {
    public static void main(String[] args) {
        /*5 键盘录入一个学生的姓名和性别，姓名如果是zhangsan，
            性别是0或者1那么打印该人信息，
            格式如下：学生的姓名是zhangsan,性别是男;否则打印其他
        */
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int sex = input.nextInt();
        System.out.println(name+(sex==1?"男":(sex==0?"女":"输入错误")));
    }
}
