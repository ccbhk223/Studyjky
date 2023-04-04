package day1;

import java.util.Arrays;

/**
 * ccb
 **/
public class T7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StrtoInt("1564561a")));
    }
    public static int[] StrtoInt(String a ) {
        char[] str = a.toCharArray();
        int[] intShuZu = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i] <= '0' || str[i] > '9') return null;
            intShuZu[i] = (int) str[i] - 48;
        }
        return intShuZu;
    }
}
