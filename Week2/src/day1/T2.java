package day1;

/**
 * ccb
 **/
public class T2 {
    /*2 将某个字符串中所有的数字删除：选做*/
    public static void main(String[] args) {
        delNumber("1a4pp77le88");
    }
    public static void delNumber(String a){
        char[] str=a.toCharArray();
        System.out.println("原字符串:"+a);
        for (int i = 0; i < str.length; i++) {
            if (str[i]>='0'&&str[i]<='9'){
                a =a.replace(str[i]+"","");
            }
        }
        System.out.println("修改后："+a);
    }
}
