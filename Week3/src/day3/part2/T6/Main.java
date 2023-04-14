package day3.part2.T6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ccb
 **/
public class Main {
    /* 封装Person类，属性private String name;private String personID;
    #生日private Date birthday;性别private Sex sex;(注Sex是枚举类型，只能是男和女)；键盘录入Person信息实例化Person对象
    name不能出现数字，personID只能是数字或者字母，birthday出生年月不能超过系统时间同时要符合日期格式（只要求输入年月日即可），性别输入0表示男生，1表示女生输入其他不可以
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sex sex = Sex.male;
        Sex sex1 = Sex.female;
        Calendar birthday = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //        Person person = new Person("ccb","0315",birthday,sex);
//        System.out.println(person);
        while (true) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            if (!isFormatName(name)) {
                System.out.println("——————————————————————");
                System.out.println("请输入身份证号码：");
                String personID = sc.next();
                if (!isFormatPersonID(personID)) {
                    System.out.println("——————————————————————");
                    System.out.println("请输入出生日期：");
                    System.out.println("出生年份：");
                    int birthYear = sc.nextInt();
                    System.out.println("出生月份：");
                    int birthMonth = sc.nextInt();
                    System.out.println("出生日：");
                    int birthDay = sc.nextInt();
                    birthday.set(birthYear, birthMonth, birthDay);
                    birthday.add(Calendar.MONTH, -1);
                    if (!(isFormatBirth(birthDay) || isFormatBirth(birthMonth) || isFormatBirth(birthYear))) {
                        System.out.println("——————————————————————");
                        System.out.println("请输入性别：（0/1）");
                        int gender = sc.nextInt();
                        if (gender == 0) {
                            Person person = new Person(name, personID, birthday, sex);
                            System.out.println(person);
                            break;
                        } else if (gender == 1) {
                            Person person = new Person(name, personID, birthday, sex1);
                            System.out.println(person);
                            break;
                        } else {
                            System.out.println("性别格式输入错误");
                        }
                    } else {System.out.println("出生日期输入错误");}
                } else System.out.println("身份证号码格式输入错误");
            } else System.out.println("姓名格式输入错误");
        }

    }

    public static boolean isFormatName(String name) {//出现数字返回true
        Pattern pattern = Pattern.compile("[\\d]+");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static boolean isFormatPersonID(String personID) {//出现不是字母或者数字的字符返回t
        Pattern pattern = Pattern.compile("[^\\da-zA-Z]+");
        Matcher matcher = pattern.matcher(personID);
        return matcher.find();
    }

    public static boolean isFormatBirth(int number) {//出现不是数字的字符返回true
        String a = number + "";
        Pattern pattern = Pattern.compile("[^\\d]+");
        Matcher matcher = pattern.matcher(a);
        return matcher.find();
    }
}
