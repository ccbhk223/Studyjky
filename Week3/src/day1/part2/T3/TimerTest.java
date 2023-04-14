package day1.part2.T3;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ccb
 **/
public class TimerTest extends Timer {
    /*3 将1-100用定时器打印出来，1秒一个数字：  使用Timer的schedule(TimerTask task, long delay, long period)*/
    public static void main(String[] args) {
        Timer timer = new Timer();
        //方法二：创建匿名方法
        timer.schedule(new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                System.out.print(i + "\t");
                i++;
                if (i % 10 == 1) {
                    System.out.println();
                }
                if (i > 100) timer.cancel();
            }
        }, 0, 10);
    }
}
