package day2.part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t1 {
    public static void main(String[] args) {
        /*1 给定一个人的姓名，判断该人姓名是否不是张三,
            不是张三打印原姓名，是张三打印”张三你好“
        */
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name.equals("张三")?"张三你好":name);


    }
}
