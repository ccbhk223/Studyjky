package day4.part1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ccb
 **/
public class T3 {
    /*3 将周一到周五的相关年月日打印出来*/
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        String[] weekDays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六","星期日"};
        System.out.println("今天星期几: " + weekDays[(calendar.get(Calendar.DAY_OF_WEEK)+5)%7]+calendar.get(Calendar.DAY_OF_WEEK));
        int index = (calendar.get(Calendar.DAY_OF_WEEK)+5)%7;//取这周星期一的
        calendar.add(Calendar.DAY_OF_YEAR,-index);
        SimpleDateFormat sdf =new SimpleDateFormat("MM-dd");
        System.out.println(" 星期一   星期二   星期三   星期四   星期五");
        for (int i = 0; i < 5; i++) {
            System.out.print(sdf.format(calendar.getTime())+"    ");
            calendar.add(Calendar.DAY_OF_YEAR,+1);
        }
    }
}
