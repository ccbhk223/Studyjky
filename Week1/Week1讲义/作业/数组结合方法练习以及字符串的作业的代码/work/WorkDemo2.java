package com.work;

import java.util.Scanner;

public class WorkDemo2 {
    public static void main(String[] args) {
        // 1 键盘录入字符串，得到改字符串字母的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.next();
        int count = WorkDemo2.getCountLeteter(s);//实际参数
        // 2 键盘录入字符串表示人名，要求人名中不能出现字母：标记
        boolean isHas = WorkDemo2.isHasLetter(s);//后端校验

        // 3 键盘录入密码，要求必须是纯数字6位
        boolean isSuccess = WorkDemo2.checkPassword(s);
        //4 自行学习了解String的方法：int =       indexOf(String ch) :得到字符串第一次出现的位置 ，大家直接了解这个方法就行不用管deleteCharAt了
           String s1 = "123331233";   //"12"第一次出现
            int index = s1.indexOf("56");//0  -1

    }
    //1得到某个字符串字母的个数
    public  static  int getCountLeteter(String s){//125r34b43 8t7
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c >='A' && c <='Z' ||c >='a' && c <='z'){
                count++;
            }
        }



        return count;
    }
    //判断某个字符串中是否有字母
    public static  boolean isHasLetter(String s){
      //假设没有字母
        boolean isHas = false;

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c >='A' && c <='Z' ||c >='a' && c <='z'){
                isHas = true;
                break;
             }
        }
        return  isHas;
    }
    //校验密码是否正确
    public static  boolean checkPassword(String password){
        //判断是否是纯数字
        boolean isSucess = true;//假设全部都是数字
        for (int i = 0; i < password.length() ; i++) {
            char c = password.charAt(i);

            if(!(c >= '0' && c <= '9')){
                isSucess = false;
                break;
            }
        }
        return  isSucess && password.length() == 6;//只有纯数字6位才是true;其他都是false
    }
}
