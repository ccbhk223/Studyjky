package day4;

import java.util.Arrays;

/**
 * ccb
 **/
public class T4 {
    /*4 定义一个字符串数组，统计所有字母出现的次数，假定字符串如果是字母只能是单个字母
  提示：将单字母字符串转换为字符的方法：char c = "a".charAt(0); System.out.println(c >= 'A');
     * */
    public static void main(String[] args) {
        String[] T4 = {"B", "A", "B", "c","A","B22CC"};
        String context = "";
        System.out.println("--统计字符串首字母次数--");
        System.out.println("原数组"+Arrays.toString(T4));
        /*统计字符串首字母次数*/
        for (int i = 0; i < T4.length; i++) {//循环每个字符串
            char a = T4[i].charAt(0);
            if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
                boolean key = false;
                for (int k = 0; k < i; k++) {//判断是否之前出现过
                    if (a==T4[k].charAt(0)) {
                        key = true;
                        break ;
                    }
                }
                if (!key) {
                    int count = 0;
                    for (int j = 0; j < T4.length; j++) {//计算字母次数
                        char b = T4[j].charAt(0);
                        if (a == b) count++;
                    }
                    System.out.println(a + " have " + count);

                }
            }
        }
        /*统计所有字母字符次数*/
        System.out.println("--统计所有字母字符次数--");
        for (String i :T4
             ) {
            context=context.concat(i);
        }
        System.out.println("context = " + context);
        for (int i = 0; i < context.length(); i++) {
            char isLetter = context.charAt(i);
            if ((isLetter >= 'A' && isLetter <= 'Z') || (isLetter >= 'a' && isLetter <= 'z')) {
                boolean key = false;
                for (int k = 0; k < i; k++) {//判断是否之前出现过
                    if (isLetter==context.charAt(k)) {
                        key = true;
                        break ;
                    }
                }
                if (!key) {
                    int count = 0;
                    for (int j = 0; j < context.length(); j++) {//计算字母次数
                        char b = context.charAt(j);
                        if (isLetter == b) count++;
                    }
                    System.out.println(isLetter + " have " + count);

                }
            }

        }
    }
}
