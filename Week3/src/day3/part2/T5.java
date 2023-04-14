package day3.part2;

import java.util.Calendar;
import java.util.Date;


/**
 * ccb
 **/
public class T5 {
    /*使用Date的getTime()(可以用其他方法)计算你活了多少天*/
    public static void main(String[] args){
        Calendar birthday = Calendar.getInstance();
        birthday.set(2000, Calendar.MARCH,23);  //指定开始日期
        Date start = birthday.getTime(); // 将日历类转换成Date类
        Date d = new Date();  // 获取当前日期
        long days = (d.getTime() - start.getTime()) / (1000*60*60*24);
        System.out.println(days);
    }
}
