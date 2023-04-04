package day4;

/**
 * ccb
 **/
public class T1 {
    /*1 定义一个数字数组，将数组中所有的水仙花数打印出来并且求和打印，格式如下：153+.....=和*/
    public static void main(String[] args) {
        int[] T1 = {370, 371, 100, 407, 512, 111, 335};
        for (int a : T1
        ) {
            System.out.print(isShuiXian(a) ? a + " " : "");
        }
    }

    public static boolean isShuiXian(int a) { //判断是否是水仙花数
        int sum = 0, number = a;
        while (number != 0) {
            sum += (int) Math.pow(number % 10, 3);
            number /= 10;
        }
        if (sum == a) {
            return true;
        }
        return false;
    }
}
