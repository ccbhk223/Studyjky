import day4.T0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ccb
 **/
public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), H = sc.nextInt(), n = sc.nextInt(), R = sc.nextInt();
        //西南角坐标为 (0, 0)， 东南角坐标为 (W, 0)， 西北角坐标为 (0, H)， 东北角坐标为 (W, H)
        int[][] Wifi = new int[n][2];//二维记录几个信号塔，一维记录信号塔坐标
        for (int i = 0; i < n; i++) {
            int nW = sc.nextInt(), nH = sc.nextInt();
            Wifi[i][0] = nW;
            Wifi[i][1] = nH;
        }
        System.out.println(isFine(Wifi, R, W, H));
    }

    public static int isFine(int[][] a, int R, int W, int H) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < H; k++) {
                for (int l = 0; l < W; l++) {
//                    for (int j = 0; j < 2; j++) {
                    int dx = l - a[i][0], dy = k - a[i][1];
                    if (dx * dx + dy * dy <= R * R) {
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
