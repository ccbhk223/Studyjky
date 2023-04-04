package day4;

/**
 * ccb
 **/
public class T9 {
    /*9 尝试使用二分法查找查找某个数值在数组中出现的位置：参照课上代码选做实现*/
    static int[] T9 = {5, 15, 55, 64, 78, 99, 101};

    public static void main(String[] args) {
        int a=99;
        int isFind = Erfen(0, T9.length - 1, a);
        if (isFind!=-1) {
            System.out.println(a+"在第 "+(isFind+1)+" 个位置");
        }
    }

    public static int Erfen(int left, int right, int a) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (T9[middle] == a) return middle;
        if (a > T9[middle]) {
            left = middle + 1;
            return Erfen(left, right, a);
        } else {
            right = middle - 1;
            return Erfen(left, right, a);
        }
    }
}
