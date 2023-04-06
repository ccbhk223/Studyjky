package day2.part2;

/**
 * ccb
 **/
public class T2 {
    /*给定字符串http://localhost:8080/common/TestCommon.action获取请求名称，
    并且打印请求名称中是否出现连续3个a字符组合[请求名就是最后一个/之后最后一个.之前的内容]*/
    public static void main(String[] args) {
        input("http://localhost:8080/common/TestCommon.action");
    }

    public static void input(String a) {
        String[] strList = a.split("/");
//        System.out.println(Arrays.toString(strList));
        if (strList[strList.length-1].contains(".")) {
            String requestName = strList[strList.length - 1];
            requestName = requestName.substring(0,requestName.indexOf("."));
            System.out.println("请求名字：" + requestName);
            if (requestName.contains("aaa")) {
                System.out.println("请求名字中出现连续3个a字符组合");
            } else System.out.println("请求名字中未出现连续3个a字符组合");
        } else System.out.println("没有请求名称");

    }
}
