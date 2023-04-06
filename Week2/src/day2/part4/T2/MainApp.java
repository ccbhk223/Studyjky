package day2.part4.T2;

import java.util.Scanner;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学员编号：");
        String SNO = sc.next();
        System.out.print("请输入学员姓名：");
        String SName = sc.next();
        System.out.print("请输入学员性别：");
        String SSex = sc.next();
        System.out.print("请输入学员身高：");
        Double SStature = sc.nextDouble();
        System.out.print("请输入学员年龄：");
        int SAge = sc.nextInt();
        Student student1 = new Student(SNO,SName,SSex,SStature,SAge);
        System.out.println(student1.toString());

    }
}
