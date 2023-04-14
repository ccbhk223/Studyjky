package day3.part2;

import java.util.Scanner;

/**
 * ccb
 **/
public class T4 {
    /*4 键盘录入用户名，必须以英文开头,只能包含英文,数字和_;最少6位,做多12位*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            StringBuffer username = new StringBuffer(sc.next());
        System.out.println(isUsername(username));



    }
    public static boolean isUsername(StringBuffer stringBuffer) {
        char firstStr = stringBuffer.charAt(0);
        boolean key =true;
        if ((firstStr >= 'a' && firstStr <= 'z' || firstStr >= 'A' && firstStr <= 'Z')&&(stringBuffer.length()>=6&&stringBuffer.length()<=12)) {
            for (int i = 1; i < stringBuffer.length(); i++) {
                char c = stringBuffer.charAt(i);
                if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_')) {
                    key = false;
                }
            }
        }else return false;
        return key;
    }
}
