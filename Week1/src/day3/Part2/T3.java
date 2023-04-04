package day3.Part2;

/**
 * ccb
 **/
public class T3 {
    /*3 随机产生10个随机数（100以内）放置到数组：选做
    * */
    public static void main(String[] args) {
        int[] T3 = new int[10];
        for (int i = 0; i < 10; i++) {
            T3[i] = (int)(Math.random()*100);
        }
        for (int i :T3
             ) {
            System.out.print(i+" ");
        }
    }
}
