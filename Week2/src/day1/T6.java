package day1;

/**
 * ccb
 **/
public class T6 {
    /*6 给定字符串，字符串以空格隔开，判断每个空格隔开的字符串是否以s结尾*/
    public static void main(String[] args) {
        System.out.println(isSEnd("Is As Csas"));
    }
    public static boolean isSEnd(String a ){
        String[] aNew = a.split(" ");
        System.out.println("原字符串:"+a);
        for (String i :aNew
        ) {
            char[] str = i.toCharArray();
            if (str[str.length-1]!='s')return false;
        }
        return true;
    }
}
