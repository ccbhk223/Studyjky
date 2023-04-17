package day5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ccb
 **/
public class T4 {
    /*# 4 在今天作业基础上实现打印本月日历*/
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M.dd");
        System.out.println("今年四月份的日历：");
        String[] weekDays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) - 1;
        calendar.add(Calendar.DAY_OF_YEAR, -dayOfMonth);//日历调到本月第一天
        for (int i = 0; i < (calendar.get(Calendar.DAY_OF_WEEK) + 5) % 7; i++) {
            System.out.print("        ");
        }
        for (int i = 0; i < 30; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                System.out.print(" "+sdf.format(calendar.getTime()) + "   ");
                calendar.add(Calendar.DAY_OF_YEAR, +1);
            } else {
                System.out.println(" "+sdf.format(calendar.getTime()) + "\n");
                calendar.add(Calendar.DAY_OF_YEAR, +1);
            }
        }
    }
}
