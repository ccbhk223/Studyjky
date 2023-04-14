package day3.part1.T1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ccb
 **/
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2000, 2,3,0,0);
        System.out.println(localDate);
        newTime(localDate);

    }

    public static void newTime(LocalDateTime localDateTime) {
        int hour = localDateTime.getHour();
        if (hour > 12) {
            System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd 下午HH点mm分")));
        } else System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd 上午HH点mm分")));
    }
}

