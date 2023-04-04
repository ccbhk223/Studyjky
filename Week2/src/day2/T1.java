package day2;

/**
 * ccb
 **/
public class T1 {
    /*给定字符串表示用户名称，验证用户名称是否符合要求只能由字母，数字，_,$组成的长度是8到16位的字符串，否则提示不符合要求*/
    public static void main(String[] args) {
        System.out.println(UsernameIsRight("ccb12_2131$sad"));
    }

    public static boolean UsernameIsRight(String a) {
        char[] str = a.toCharArray();
        for (char i : str
        ) {
            if (!(i >= 'a' && i <= 'z' || i >= 'A' && i <= 'Z' || i >= '0' && i <= '9' || i == '_' || i == '$')) {
                System.out.println("不符合要求");
                return false;
            }
        }
        if (!(str.length >= 8 && str.length <= 16)) {
            System.out.println("不符合要求");
            return false;
        }
        return true;
    }
}
