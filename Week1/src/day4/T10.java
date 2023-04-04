package day4;

/**
 * ccb
 **/
public class T10 {
    /*10 通过二维数组定义一个字符二维数组存放静夜思这首古诗；char[][] shi = {{'床','前','明','月','光'}，{}，{}，{}}要求通过二维
    数组的遍历将古诗每个字逗号隔开打印出来升级选做：将古诗每个字逗号隔开竖着打印出来
    */
    public static void main(String[] args) {
        char[][] shi = {{'床', '前', '明', '月', '光'}, {'疑', '是', '地', '上', '霜'}, {'举', '头', '望', '明', '月'}, {'低', '头', '思', '故', '乡'}};
        char[][] shi2 = new char[5][4];
        for (char[] i : shi
        ) {
            for (int j = 0; j < i.length; j++) {
                if (j == i.length - 1) {
                    System.out.print(i[j]);
                } else {
                    System.out.print(i[j] + ",");
                }
            }
            System.out.println("。");
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                shi2[j][i] = shi[i][j];
            }
        }
        for (char[] i : shi2
        ) {
            for (int j = 0; j < i.length; j++) {
                if (j == i.length - 1) {
                    System.out.print(i[j]);
                } else {
                    System.out.print(i[j] + ",");
                }
            }
            System.out.println();
        }
    }
}