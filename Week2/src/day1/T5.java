package day1;

/**
 * ccb
 **/
public class T5 {
    /*5 判断字符串中某个字符串是否只是出现了一次*/
    public static void main(String[] args) {
        System.out.println(isChuXian1("advvdds",'v'));;
    }
    public static boolean isChuXian1(String a,char b){
        char[] str = a.toCharArray();
        int index = a.indexOf(b);
        int count =0;
        for (int i = index; i < str.length; i++) {
            if (str[i]==b)count++;
        }
        return count == 1;
    }
}
