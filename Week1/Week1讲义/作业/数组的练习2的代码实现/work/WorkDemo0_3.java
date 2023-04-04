package com.work;

import java.util.Arrays;

public class WorkDemo0_3 {
    public static void main(String[] args) {
        //0 将数值  1,2,3,4     45,45,12,0    56,67,78,90,12放入二维数组
        //   将二维数组中每个一维数组的信息从大到小排序后打印出来
        int[][] erWei = {{1,2,3,4},{45,45,12,0},{56,67,78,90,12}};
        for (int i = 0; i < erWei.length ; i++) {
            int[] yiWei = erWei[i];
            Arrays.sort(yiWei);//从小到大
            for (int j = yiWei.length-1; j >= 0 ; j--) {
                System.out.print(yiWei[j]+"  ");
            }
            System.out.println();
        }
        //1 定义一个数字数组，将数组中所有的水仙花数打印出来并且求和打印，格式如下：
        //  ""+153+.....=和
        int[] shuZu1 = {153,371,370,90,89,180,156};
        int sum = 0;
        String content = "";
        for (int i = 0; i <shuZu1.length ; i++) {
            //判断该数是否是水仙花
            boolean isShuiXian = true;//是水仙
            int weiShu = shuZu1[i] % 10;
            int weiShu1 = shuZu1[i] / 10 % 10;
            int weiShu2 = shuZu1[i] / 10 / 10 % 10;
            isShuiXian = (shuZu1[i] == weiShu*weiShu*weiShu+weiShu1*weiShu1*weiShu1+weiShu2*weiShu2*weiShu2);
            if(isShuiXian) {
                sum = sum + shuZu1[i];
                if (i == 0) {
                    content = content + shuZu1[i];//153 +
                } else {
                    content = content + "+" + shuZu1[i];
                }
            }

        }
        System.out.println(content + " = "+ sum);
        //2 定义一个数字数组，将数组中所有出现次数小于3的数值全部删除，最后从小到大排序打印
        int[] shuZu2 = {1,1,2,3,2,3,0,0,4,4,4};
       /* for (int i = 0; i < shuZu2.length ; i++) {
            int
        }*/
        //统计某个数值出现的次数
        int delCount = 0;
        for (int k = 0; k < shuZu2.length-delCount; k++) {   //1  2    3 2  4  4  4 0
            //假设没有被统计过
            boolean isChuXian = false;
            for (int i = 0; i < k ; i++) {
                if(shuZu2[i] == shuZu2[k]){
                    isChuXian = true;
                    break;
                }
            }


            //统计每个位置出现次数
            if(!isChuXian) {
                int count = 0;
                int shu = shuZu2[k];
                for (int i = 0; i < shuZu2.length; i++) {
                    if (shuZu2[i] == shu) {
                        count++;
                    }
                }
                if(count>0&&count < 3){//count = 1/2
                    //删除shu:移动+补位
                     delCount++;

                    for (int j = k; j < shuZu2.length-1 ; j++) {
                           shuZu2[j] = shuZu2[j+1];
                    }
                    k--;//防止后面的那个数就是你要删除的数
                    shuZu2[shuZu2.length-1] = 0;
                }
            }

        }
        System.out.println("删除后的数组是："+Arrays.toString(shuZu2));

      //3 定义一个数字数组，将数组中次数出现偶数位的数字修改为原数字的位数放入，通过forEach循环打印
        int[] shuZu4 = {12,12,3,4,5,5,5,1234,5};
        //1 1 3 4 1 1 1 1 1234 56
        for (int i = 0; i < shuZu4.length; i++) {//每个被统计的数下标

      /*      boolean isTongJi = false;//没有被统计过
            //验证假设
            for (int j = 0; j < i; j++) {
                if(shuZu4[i] ==  shuZu4[j]){
                    isTongJi = true;//被统计过了
                    break;
                }
            }*/

            //统计
            int count = 0;
            for (int j = 0; j < shuZu4.length ; j++) {
                if(shuZu4[i] == shuZu4[j]){
                    count++;
                }
            }
            if(count % 2 == 0){
                //遍历数组找这个数，全部改掉
                System.out.println("我们要改的那个数："+shuZu4[i]);//2
                int gaiShu = shuZu4[i];
                for (int j = 0; j < shuZu4.length; j++) {
                    if(shuZu4[j] == gaiShu){
                        shuZu4[j] = (""+shuZu4[j]).length();

                    }
                }
            }
        }
        System.out.println("修改后的位数数组："+Arrays.toString(shuZu4));

    }
}
