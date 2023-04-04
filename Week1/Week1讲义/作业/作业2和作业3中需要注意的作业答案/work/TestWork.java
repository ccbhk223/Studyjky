package com.work;

import java.util.Scanner;

public class TestWork {
    //5 键盘录入一个学生的姓名和性别，姓名如果是zhangsan，性别是0或者1那么打印该人信息，
    // 格式如下：学生的姓名是zhangsan,性别是男;否则打印其他
    public static void main(String[] args) {
        //1 键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = scanner.next();//
        boolean nameResult = name.equals("zhangsan");
        String sex = scanner.next();
        boolean sexResult = sex.equals("0") || sex.equals("1");
        System.out.println(nameResult && sexResult?"学生的姓名是"+nameResult+"性别是男":"其他");



        //打印1-100以内的奇数:for
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }

        //2 键盘录入行号，打印对应行数的正方形，正方形里面放置&
        System.out.println("请你输入行号");
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {//i行

            for (int j = 1; j <= line ; j++) {
                System.out.print("&");
            }
            System.out.println();//换行



        }
        //3 键盘录入行号，打印对应行的金字塔
        System.out.println("请输入金字塔的行数");
        int line1 = scanner.nextInt();
        for (int i = 1; i <= line1 ; i++) {//i 表示行号

            //打印空格：空格数 = line1 - i
            for (int j = 1; j <= line1 - i ; j++) {
                System.out.print(" ");
            }



            //打印*:2*i-1
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }

            //换行
            System.out.println();

        }

        //6 键盘录入某个数，判断某个数是否是素数，如果是打印是素数，如果不是打印不是素数（选做）
          //8不是素数   7是素数：找2-本身数-1之间的所有数能不能被该数整除，能不是素数；全部除完一个都不能是素数
        //需要知道在整个除过程有没有一次是能的：标记

        int shuValue = 8;
        //如果你需要在一段程序中知道某部分语句会不会发生，使用标记

        boolean isCan = false;//假设没有一个数能被整除


        //验证你的假设
        for (int i = 2; i < shuValue ; i++) {
            if(shuValue % i == 0){//能
               isCan = true;//假设推翻
            }
        }
        //根据我们假设结果
        if(!isCan){
            System.out.println("是素数");
        }
        else{
            System.out.println("不是素数");
        }


   //for循环实现统计水仙花的个数:找到10000以内的水仙花数
        for (int i = 100; i <=999 ; i++) {
            int shuValue1 = i;
            //178 = 1*1*1 + 7*7*7 + 8*8*8;
            int weiShu = shuValue1 % 10;//8
            int weiShu1 = shuValue1 / 10 % 10;//7
            int weiShu2 = shuValue1 / 10 / 10 % 10;//1
            if(shuValue1 == weiShu * weiShu * weiShu + weiShu1 * weiShu1 * weiShu1 + weiShu2 * weiShu2 * weiShu2){
                System.out.println(shuValue1+"水仙花");
            }
        }


      //找到1000以内的所有素数的个数？？？




    }

}
