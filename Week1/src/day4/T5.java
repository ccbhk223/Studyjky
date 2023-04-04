package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T5 {
    /*5 定义一个字符串数组，得到长度是3并且值不等于"lil"的元素个数*/
    public static void main(String[] args) {
        String[] allMess = {"B","123","lil", "A","lil", "BBB", "c","A","B22"};
        System.out.println("原数组"+Arrays.toString(allMess));
        int count=0;
        for (String a:allMess
             ) {
            if(a.length()==3&&a!="lil"){
                count++;
            }
        }
        System.out.println("长度是3并且值不等于\"lil\"的元素个数: " + count);
    }

}
