package com.work;

import java.util.Arrays;
import java.util.Scanner;

public class WrokDemo {
    //1 定义方法完成数组中某个元素出现出现次数的统计
    public  static  int count(int[] shuZu,int shu){
        int count = 0;
        for (int i = 0; i <shuZu.length ; i++) {
            if(shu == shuZu[i]){
                count++;
            }
        }


        return  count;
    }
   //2 定义方法完成判断某个数组中某个元素是否出现过
    public  static  boolean isExist(int[] shuZu,int shu){
        //假设元素没有出现过
        boolean isExist = false;
        for (int i = 0; i < shuZu.length; i++) {
            if(shuZu[i] == shu){
                //出现过
                isExist = true;
                break;

            }

        }

        return  isExist;//停止方法

    }
    //3 定义方法完成得到某个数组中所有元素的和
    public  static  int getSum(int[] shuZu){
        int sum = 0;
        for (int i = 0; i < shuZu.length; i++) {
            sum = sum + shuZu[i];
        }


        return  sum;

    }
    //4 定义方法完成删除数组中某个元素
    public  static  void deleShuZu(int[] shuZu,int deleShu){
        int deleCount = 0;//删除的元素的个数
   //   12         45   56   67  0 0  0
        for (int i = 0; i < shuZu.length - deleCount ; i++) {
          if(deleShu == shuZu[i]){
              //删除：
              for (int j = i; j < shuZu.length-1 ; j++) {
                  shuZu[j] = shuZu[j+1];
              }
              shuZu[shuZu.length-1 - deleCount] = 0;
          }
        }
    }
    //5 定义方法完成数组的排序
    public static void sortShuZu(int[] shuZu){
        Arrays.sort(shuZu);
    }
    //6 定义数组完成将数组中某个位置的元素修改为原数值拼接1比如12就变成121
    public  static  void changeShuZu(int[] shuZu,int index){
        if(index >= shuZu.length){
            System.out.println("下标太大了");
        }else if(index >= 0){
            String shuString =  shuZu[index] + "1";
            shuZu[index] = Integer.parseInt(shuString);
        }
        else{
            System.out.println("下标太小");
        }
    }
    public static void main(String[] args) {
        int[] shuZu = null;//先定义
        Scanner  scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 初始化   2退出");
             String choose = scanner.next();
             if(choose.equals("1")){

                 int count = WrokDemo.count(shuZu,23);
                 System.out.println("次数："+count);
                 boolean isExist = WrokDemo.isExist(shuZu,23);
                 int sum = WrokDemo.getSum(shuZu);
                 WrokDemo.deleShuZu(shuZu,23);
                 WrokDemo.sortShuZu(shuZu);
                 WrokDemo.changeShuZu(shuZu,-6);
             }
        }


    }

}
