package day2.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class t0 {
    public static void main(String[] args) {
        /*0 键盘录入成绩，打印等级，60以下：不及格；60-79：D   80-99:C    其他：优秀
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("你的成绩是：");
        int grade = input.nextInt();
        if (grade<60){
            System.out.println("不及格");
        }else if(grade<80){
            System.out.println("D");
        }else if(grade<100){
            System.out.println("C");
        }else {
            System.out.println("优秀");
        }

    }
}
