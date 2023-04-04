package day5.part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class T7 {
    /*7 选做：编写页面测试上方6个方法：
    主界面：1 数组初始化  2 退出
    输入1后进入界面：1 测试6  2 测试5  3 测试4  4 测试3  5 测试2  6 测试1 7 退出（退回上一级）*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("* * * * * * * * *");
        System.out.println("*   测试主页面   *");
        System.out.println("* * * * * * * * *");
        while1:while (true) {
            System.out.println("1 数组初始化  2 退出");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    int[] list = new int[10];
                    for (int i = 0; i < 10; i++) {
                        list[i] = (int) (Math.random() * 10);
                    }
                    System.out.println("成功生成数组：" + Arrays.toString(list));
                    while2:while (true){
                        System.out.println("1 测试6  2 测试5  3 测试4  4 测试3  5 测试2  6 测试1 7 退出（退回上一级）");
                        int key1 = sc.nextInt();
                        switch (key1) {
                            case 1:
                                System.out.println("定义数组完成将数组中某个位置的元素修改为原数值拼接");
                                System.out.println("原数组" + Arrays.toString(list));
                                System.out.print("添加位置:");
                                int case1w = sc.nextInt()-1;
                                System.out.print("添加数值:");
                                int case1z = sc.nextInt();
                                T6.pinJie(list,case1w,case1z);
                                System.out.println(Arrays.toString(list));
                                break ;
                            case 2:
                                System.out.println("定义方法完成数组的排序");
                                System.out.println("原数组" + Arrays.toString(list));
                                T5.DaoXu(list);
                                break ;
                            case 3:
                                System.out.println("定义方法完成删除数组中某个元素");
                                System.out.print("del index:");
                                int b =sc.nextInt();
                                T4.del(list,b);
                                break ;
                            case 4:
                                System.out.println("定义方法完成得到某个数组中所有元素的和");
                                System.out.println("原数组" + Arrays.toString(list));
                                System.out.println(T3.sumList(list));
                                break ;
                            case 5:
                                System.out.println("定义方法完成判断某个数组中某个元素是否出现过");
                                System.out.println("原数组" + Arrays.toString(list));
                                if(T2.isHave(list)){
                                    System.out.println("yes");
                                }else System.out.println("no");
                                break ;
                            case 6:
                                System.out.println("定义方法完成数组中某个元素出现出现次数的统计");
                                System.out.println("原数组" + Arrays.toString(list));
                                System.out.print("haved appear:");
                                int c =sc.nextInt();
                                System.out.println(c+"出现了"+T1.countNumber(list,c)+"次");
                                break ;
                            case 7:
                                System.out.println("返回主菜单");
                                break while2;
                            default:
                                System.out.println("输出格式错误");
                                break;
                        }
                    }
                    break ;
                case 2:
                    System.out.println("exit！");
                    System.exit(0);
                default:
                    System.out.println("输出格式错误");
                    break;
            }
        }

    }
}
