package day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class TestDemo {

    public static boolean isHuiWen(int a) {//判断回文
        boolean key = true;
        char[] str = (a + "").toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != str[str.length - i - 1]) {
                key = false;
                break;
            }
        }
        return key;
    }

    public static void Login() {
        while1:
        while (true) {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            String pwd = sc.next();
            char[] nameChar = name.toCharArray();
            char[] pwdChar = pwd.toCharArray();
            for (char a : nameChar
            ) {
                if (a >= 'a' && a < 'z'||a>'A'&&a<'Z' || a == '_') {
                    System.out.println("姓名不能出现_和字母");
                    System.out.println("请重新出入名字和密码");
                    continue while1;
                }
            }
            for (char a : pwdChar
            ) {
                if (a < '0' || a > '9') {
                    System.out.println("密码必须为纯数字");
                    System.out.println("请重新出入名字和密码");
                    continue while1;
                }
            }
            if (pwdChar.length != 6) {
                System.out.println("密码必须为6位");
                System.out.println("请重新出入名字和密码");
            } else {
                System.out.println("输入全部符合");
                break;
            }
        }
    }

    public static void shuZuFanZhuan(String a) {
        char[] str = a.toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            char temp = 0;
            temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - 1 - i] = temp;
            System.out.println(Arrays.toString(str));
        }
        System.out.println(Arrays.toString(str));
    }

    public static int SumSuShu(int[] a) {
        int sum = 0;
        for (int i : a
        ) {
            boolean key = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    key = true;
                    break;
                }
            }
            if (!key) sum += i;
        }
        return sum;
    }

    public static void ciShu(String a) {
        char[] str = a.toCharArray();
        boolean[] strisHave = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {
            char b = str[i];
            int count = 1;
//            int c = a.indexOf(b);
            for (int j = i + 1; j < str.length; j++) {
                if (b == str[j]) {
                    count++;
                    strisHave[j] = true;
                }
            }
            if (!strisHave[i]) System.out.println(b + "出现了" + count + "次");
        }
    }
}

