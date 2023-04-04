package day2.part2;

/**
 * ccb
 **/
public class t8 {
    public static void main(String[] args) {
    /*8 分析：
 	什么是水仙花数呢?
  	所谓的水仙花数是指一个三位数[100,999]，其各位数字的立方和等于该数本身。
 	举例：153就是一个水仙花数。
 	153 = 1*1*1 + 5*5*5 + 3*3*3

    for循环实现统计水仙花的个数
    * */
        System.out.println("三位数的水仙花数有：");
        for (int i = 100; i < 1000; i++) {
            if (Math.pow(i%10,3)+Math.pow(i/10%10,3)+Math.pow(i/100,3)==i){
                System.out.print(i+"\t");
            }
        }

    }

}
