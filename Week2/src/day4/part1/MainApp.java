package day4.part1;

/**
 * ccb
 **/
public class MainApp {
    /*封装学生类信息和要求同word文档，封装课程类信息和要求同word文档；在学生中定义成员变量存储学生可以选择的一门课程，
    编写方法完成zhangsan选择语文这门课程；最后调用方法测试*/
    public static void main(String[] args) {
        Course course1 = new Course("c001","语文","2000-01-01");
        Course course2 = new Course("c002","英语","2001-01-01");
        Student student1 = new Student("s001","ccb","男",100,20);
        student1.setSCourse(course1);
//        student1.setSCourse(course2);
        System.out.println(student1);
    }
}
