package day1;

/**
 * ccb
 **/
public class T1 {
    /*1 将某个字符串中的所有小写字母i和k变成大写字母：使用new String(char[]) 和toCharArray()*/
    public static void main(String[] args) {
        UptoLow("sadjniiikkkasd");
    }

    public static void UptoLow(String a) {
        char[] str = a.toCharArray();
        System.out.println("原字符串\t:"+a);
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'i' || str[i] == 'k') {
                str[i]= toUpperCase(str[i]);
            }
        }
        String strNew = new String(str);
        System.out.println("修改后\t:"+strNew);
    }
    public static char toUpperCase(char c1){
        int b = (int) c1 -32;     //a-32得出小写对应大写的ascll数值
        return (char)b;        //返回bb；就是返回大写的字符

    }
    public static char toLowerCase(char c1){
        int b = (int) c1 +32;     //a-32得出小写对应大写的ascll数值
        return (char)b;        //返回bb；就是返回大写的字符

    }
}
