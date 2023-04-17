package day4.part1;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T1 {
    /*1 对于键盘录入的字符串纯数字，要求将其修改成小数位数不超过4位的纯数字字符串，如果超过了那么使用四舍五入取舍*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.matches("\\d+[.]?\\d*")) {
//            String[] str1=str.split("\\.");
            Double aDouble = Double.parseDouble(str);
            BigDecimal b1 = new BigDecimal(aDouble);
            double newDouble = b1.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(newDouble);
//            System.out.println(Arrays.toString(str1));
        }else System.out.println("error");
    }
}
