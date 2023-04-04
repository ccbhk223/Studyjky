package com.work;

import java.util.Arrays;

public class WorkDemo5_8_10 {
    public static void main(String[] args) {
        //5 定义一个字符串数组，得到长度是3并且值不等于"lil"的元素个数
        int count = 0;
        String[] shuZu = {"12","lil","77888"};
        for (int i = 0; i < shuZu.length; i++) {
            if(shuZu[i].length() == 3 && !shuZu[i].equals("lil")){
                count++;
            }
        }



        //8  给定数值数组，将数组中所有大于89的全部全部从小到大排序，其他元素位置不变，最后通过Arrays.toString方法将其打印出来
         int[] numbers = {12,23,34,98,93,90,67,105,100};
        //12   23   34  90  93  98  67  100  105
        System.out.println("排序前："+ Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {//比较数的下标

            if(numbers[i] > 89) {
                //比较
                int min = i;
                for (int j = i+1; j < numbers.length; j++) {////被比较数的下标
                    if (numbers[min] > numbers[j] && numbers[j] > 89) {
                        min = j;
                    }
                }
                if (min != i) {
                    int temp = numbers[i];
                    numbers[i] = numbers[min];
                    numbers[min] = temp;
                }
            }

        }
        System.out.println("排序后："+ Arrays.toString(numbers));



        // 10 通过二维数组定义一个字符二维数组存放静夜思这首古诗；
        //     char[][] shi = {{'床','前','明','月','光'}，{}，{}，{}}
        //要求通过二维数组的遍历将古诗每个字逗号隔开打印出来
        //升级选做：将古诗每个字逗号隔开竖着打印出来
        char[][] shi = {{'床','前','明','月','光'},  //第一个一位
                         {'移','是','第','上','双'},  //
                          {'句','头','往','名','月'},
                          {'第','头','思','古','想'}};
        for (int i = 0; i < shi.length ; i++) {//第一个一位

            for (int j = 0; j < shi[i].length ; j++) {
                System.out.print(shi[i][j] +",");
            }
            System.out.println();

        }
        //[0][0]  [1][0]  [2][0]   [3][0]
        //[0][1]  [1][1]  [2][1]   [3][1]


    }
}
