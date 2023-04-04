package day3.Part1;

import java.util.Scanner;

/**
 * ccb
 **/
public class t3 {
    /*3 键盘录入1-7数字，使用switch分支语句实现打印星期几，
    例如输入1打印星期一
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("星期一");break;
            case 2:
                System.out.println("星期二");break;
            case 3:
                System.out.println("星期三");break;
            case 4:
                System.out.println("星期四");break;
            case 5:
                System.out.println("星期五");break;
            case 6:
                System.out.println("星期六");break;
            case 7:
                System.out.println("星期天");break;
            default:
                System.out.println("error");
                break;
        }
    }
}
