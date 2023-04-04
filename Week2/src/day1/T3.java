package day1;

/**
 * ccb
 **/
public class T3 {
    /*3 键盘录入一串字符串以空格隔开，输出的时候将每个单词的首字母变成大写*/
    public static void main(String[] args) {
        input("i have a apple");
    }
    public static void input(String a){
        String[] aNew = a.split(" ");
        String context = "";
        System.out.println("原字符串:"+a);
        for (String i :aNew
             ) {
            char[] str = i.toCharArray();
            str[0] = T1.toUpperCase(str[0]);
            context = context+new String(str)+" ";
        }
        System.out.println("修改后："+context);
//        for (String i:aNew
//             ) {
//            context =context+i+" ";
//        }
//        String strNew = new String(str);


    }
}
