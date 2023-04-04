package com.work;

import java.util.Arrays;

public class MethodAndWorkDemo {
    //2个数的交换
    public static  void exchange(int a,int b){
        System.out.println("交换前：a = "+a+"    b= "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a = "+a+"    b= "+b);

    }
    public static void main(String[] args) {
        //值传递和地址传递
        int a = 12;
        int b = 23;
        MethodAndWorkDemo.exchange(a,b);//值不是地址，修改本身能不能修改实际参数？
        System.out.println("a = "+a +"b="+b);



        //4：数组只有一个
        String[] shuZu = {"A","2","B","C"};
        //栈：shuZu = 堆中数组的地址     堆：真正的数组
        int count1 = MethodAndWorkDemo.countLetter(shuZu);//实际参数
        System.out.println("数组内容："+ Arrays.toString(shuZu));
        //6 :地址传递

        MethodAndWorkDemo.changeShuZu(new int[]{12,12,12,25,23,14,45,56},12);
      //7
        /*Scanner scanner = new Scanner(System.in);
        int[] shuZuS = new int[5];
        for (int i = 0; i < shuZuS.length; i++) {
            shuZuS[i] = scanner.nextInt();
        }
        Random random = new Random();
        int[] shuZuR = new int[4];
        for (int i = 0; i <shuZuR.length ; i++) {
            shuZuR[i] = random.nextInt();
        }
        int[] newShuZu = MethodAndWorkDemo.heBingShuZu(shuZuS,shuZuR);
        int index = MethodAndWorkDemo.binarySearch(new int[]{12,23,34,45,5},7);
        if(index != -1)
        System.out.println("12出现的位置："+(index+1));
        else {
            System.out.println("不存在");
        }
*/
          MethodAndWorkDemo.printCount(new int[]{12,12,12,23,23,23,34,45,34});
    }
    //11 在课上代码基础上实现：将数值数组中次数出现偶数个的全部元素打印出来，格式为12出现4次：选做
    public  static void printCount(int[] shuZu){//12 12 12 23 23  24  45
        for (int i = 0; i <shuZu.length ; i++) {
         int shu = shuZu[i];//统计shu在数组中出现的次数
            //假设没有被统计过
            boolean isChuXian = false;
            for (int j = 0; j < i ; j++) {
                if(shuZu[i] == shuZu[j]){
                    isChuXian = true;
                    break;
                }
            }
            if(!isChuXian){
                int count = 0;
                for (int j = i; j < shuZu.length ; j++) {
                    if(shu == shuZu[j]){
                        count++;
                    }
                }
               if(count % 2 == 0){
                   //出现次数是偶数
                   System.out.println(shu+"出现了"+count+"次");
               }
            }


        }

    }
    //9 尝试使用二分法查找查找某个数值在数组中出现的位置：参照课上代码选做实现
    public  static  int binarySearch(int[] shuZu,int shu){
        //排序
        Arrays.sort(shuZu);
        int index = -1;
        //数值一直和中间数比较，遇到大的到右边找中间数比较，小的到左边；当left > right停止
        int left = 0;
        int right = shuZu.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if(shuZu[middle] == shu){
                index = middle;
                break;
            }
            else if(shuZu[middle] > shu){
                right = middle -1;
            }
            else{
                left = middle + 1;
            }
        }

        return  index;
    }
    //4 定义一个字符串数组，统计所有字母出现的次数，假定字符串如果是字母只能是单个字母
    //  提示：将单字母字符串转换为字符的方法：char c = "a".charAt(0);
    //                                                               System.out.println(c >= 'A');
    public static  int countLetter(String[] shuZu){//形式参数  地址传递
        String[] newShuZu = shuZu;
        int count = 0;
        //newShuZu[1] = "哈哈，我把你改了";
        for (int i = 0; i < newShuZu.length ; i++) {
            char c = newShuZu[i].charAt(0);
            if(c >='A' && c<='Z' || c >='a' && c<='z'){
                count++;
            }
        }



        return  count;
    }

    //6 给定数字数组，删除所有的2后对数组进行从大到小数值的打印
    public  static  void changeShuZu(int[] shuZu,int delNumber){
        //12    23    12   23   34   45  45   45   45   46
        //12   23    12   23   34   45   45  0   0   0
        int delCount = 0;
        for (int i = 0; i < shuZu.length - delCount ; i++) {//减少循环次数
            if(shuZu[i] == delNumber){
                //删除：1 移位+补0
                for (int j = i;j<shuZu.length-1;j++){
                    shuZu[j] = shuZu[j+1];
                }
                shuZu[shuZu.length-1] = 0;
                delCount ++;
                i--;//防止后放数值跟删除数值一样，有遗漏


            }
        }
        Arrays.sort(shuZu);
        System.out.println("删除后的数组："+Arrays.toString(shuZu));
    }
    //7 键盘录入5个数值，将5个数值放入数组同时将其和随机数产生的4个数值进行合并到新数组，
    // 同时将新数组中所有的偶数修改为比其大一的奇数
    public  static  int[] heBingShuZu(int[] shuZu1,int[] shuZu2){
        int[] newShuZu = new int[shuZu1.length + shuZu2.length];
        for (int i = 0;i<shuZu1.length;i++){
            newShuZu[i] = shuZu1[i];
        }
        for (int i = 0; i < shuZu2.length ; i++) {
            newShuZu[i + shuZu1.length]  = shuZu2[i];
        }
        for (int i = 0; i < newShuZu.length ; i++) {
            if(newShuZu[i] % 2 == 0){
                newShuZu[i] = newShuZu[i] + 1;
            }
        }


        return  newShuZu;

    }





}
