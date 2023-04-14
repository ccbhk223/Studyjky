package day3.part2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ccb
 **/
public class T3 {
    /*自行学习Calendar类，使用其方法计算500天后是几几年几月几日*/
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.set(2000, 2,3);
        calendar.add(Calendar.MONTH,-1);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
//        System.out.println(calendar.getTime().toLocaleString());
//        calendar.add(Calendar.DAY_OF_YEAR,500);
//        System.out.println(calendar.getTime().toLocaleString());

    }
}
