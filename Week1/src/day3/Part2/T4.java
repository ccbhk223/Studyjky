package day3.Part2;

/**
 * ccb
 **/
public class T4 {
    /*4 将100以内的所有素数放置到数组，最后通过forEach和普通for循环打印所有元素
    * */
    public static void main(String[] args) {
        int[] T4 = new int[100];
        int sum = 0;
        for (int j = 2; j < 100; j++) {
            int i=2;
            for (; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(j)) {
                T4[sum] = j;
                sum++;
            }
        }
        for (int i:T4
             ) {
            if (i!=0){
                System.out.print(i+" ");
            }
        }
    }
}
