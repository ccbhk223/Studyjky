package day1;

/**
 * ccb
 **/
public class T4 {
    /*4 删除字符串中所有的空格：提示：“”替换空格*/
    public static void main(String[] args) {
        delspace("I have a apple");
    }
    public static void delspace(String a ){
        String aNew = a.replace(" ","");
        System.out.println(aNew);
    }
}
