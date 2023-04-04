package day3.Part2;

/**
 * ccb
 **/
public class T2 {
    /*2 将100以内的偶数放置到数组，并且打印数组的第6个元素；并且通过普通for循环和forEach打印数组的全部元素
    * */
    public static void main(String[] args) {
        int[] T2 = new int[50];
        for (int i = 2; i < 100; i+=2) {
            T2[i/2-1] = i;
        }
        System.out.println(T2[6]);
        for (int i = 0; i < 50; i++) {
            System.out.print(T2[i]+" ");
        }
        System.out.println();
        for (int x:T2
             ) {
            System.out.print(x+" ");
        }
    }
}
