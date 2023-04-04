//import java.time.LocalDate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ccb
 **/
public class HelloWord {
    private static char[][] mat;

    /*小蓝有一个 m 行n  列的数字矩阵，矩阵中的每个数都是 0 或 1 如果从一个标为 1 的位置可以通过上下左右走到另一个标为 1 的位置，则
        称两个位置连通。与某一个标为 1 的位置连通的所有位置（包括自己）组成一个连通分块。请问矩阵中最大的连通分块有多大？
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mat = new char[30][60];
        for (int i = 0; i < 30; i++) {  //输入30*60矩阵
            mat[i] = sc.nextLine().toCharArray();
        }
        for (char[] i : mat
        ) {
            System.out.println(Arrays.toString(i));
        }
        int maxKuai = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 60; j++) {
                int kuai = 1;
                if (mat[i][j] == '1') maxKuai = Math.max(maxKuai, LianJie(i, j));
            }
        }
        System.out.println("maxKuai = " + maxKuai);
    }

    public static int LianJie(int i, int j) {
        int[] x = {-1, 1, 0, 0}, y = {0, 0, -1, 1};//shang(-1,0),xia(1,0),zuo(0,-1),you(0,1)
        int kuai = 1;
        mat[i][j] = '0';
        for (int k = 0; k < 4; k++) {
            int m = i + x[k], n = j + y[k];
//            if(m== 3||n==6){
//                continue;
//            }
//            System.out.print(m);
//            System.out.print(n);
//            System.out.println();
            if (m < 0 || m >=30 || n < 0 || n >=60 || mat[m][n] == '0') continue;
//            kuai++;
            mat[m][n] = '0';
            kuai+=LianJie(m, n);
        }
        return kuai;
        //111011
        //100001
        //101111
    }
}



