package day3.Part1;

/**
 * ccb
 **/
public class t4 {
    /*4 通过Random产生随机数，判断该随机数是否既是偶数也是素数，
    如果是打印万事大吉，否则打印效果不佳*/
    public static void main(String[] args) {
        int t4 = (int)(Math.random()*100),i=2;
        System.out.println(t4);
        for (; i <= Math.sqrt(t4); i++) {
            if (t4 % i == 0) {
                break;
            }
        }
        if (i > Math.sqrt(t4) && t4 % 2 == 0) {
            System.out.println("万事大吉");
        } else {
            System.out.println("效果不佳");
        }
    }
}
