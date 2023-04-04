package day3.Part2;

/**
 * ccb
 **/
public class T1 {
    /*1 通过数组的第一种定义方式定义一个可以存放50个数据的数组，然后将1-50放入数组，最后打印第23个数值
    * */
    public static void main(String[] args) {
        int[] T1 = new int[50];
        for (int i = 0; i <50 ; i++) {
            T1[i] = i+1;
        }
        System.out.println("T1[23] = " + T1[23]);
    }
}
