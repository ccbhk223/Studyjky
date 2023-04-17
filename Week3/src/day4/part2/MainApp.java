package day4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    //测试的
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.page();
    }

    //界面
    public void page() {
        Scanner scanner = new Scanner(System.in);
        Class banJi = new Class("001","jky");
        Course course = new Course("c01", "java");
        Course course1 = new Course("c02", "c");
        Course course2 = new Course("c03", "c+");
        Course course3 = new Course("c04", "语文");
        main1:
        while (true) {
            System.out.println("欢迎来到学生选课系统1 登录  2 注册  3 删除学生信息  4 统计选课情况 5 退出");
            String choose = scanner.next();
            if (choose.equals("1")) {
                load:
                while (true) {
                    System.out.println("欢迎进入学生登录页面，1 登录  2 退出");
                    String choose2 = scanner.next();
                    if (choose2.equals("1")) {
                        System.out.println("欢迎登录，请输入学号");
                        String stuNo = scanner.next();
                        //只有登录成功进入后才可以选课，退选；选课的时候要将可以选择的全部课程全部打印出来让学生选择
                        Student loginStudent = null;
                        for (int i = 0; i < banJi.getStuCount(); i++) {
                            if (banJi.getStudents()[i].getStuNo().equals(stuNo)) {
                                loginStudent = banJi.getStudents()[i];
                                break;
                            }
                        }
                        if (loginStudent != null) {
                            System.out.println(stuNo + "登入成功！");
                            while (true) {
                                System.out.println("1 选课  2 退课 其他.退出");
                                int loginSystem = scanner.nextInt();
                                if (loginSystem == 1) {
                                    System.out.println("可选课程：java,c,c+,语文");
                                    String selectCourse = scanner.next();
                                    switch (selectCourse) {
                                        case "java":
                                            loginStudent.addCourse(course);
                                            break;
                                        case "c":
                                            loginStudent.addCourse(course1);
                                            break;
                                        case "c+":
                                            loginStudent.addCourse(course2);
                                            break;
                                        case "语文":
                                            loginStudent.addCourse(course3);
                                            break;
                                        default:
                                            System.out.println("没有这个课程");
                                            break;
                                    }
                                } else if (loginSystem == 2) {
                                    System.out.println("请输出退课名称");
                                    String delCourse = scanner.next();
                                    switch (delCourse) {
                                        case "java":
                                            loginStudent.delCourse(course);
                                            break;
                                        case "c":
                                            loginStudent.delCourse(course1);
                                            break;
                                        case "c+":
                                            loginStudent.delCourse(course2);
                                            break;
                                        case "语文":
                                            loginStudent.delCourse(course3);
                                            break;
                                        default:
                                            System.out.println("没有这个课程");
                                            break;
                                    }
                                }else break ;
                            }
                        }
                    } else if (choose2.equals("2")) {
                        continue main1;
                    } else {
                        System.out.println("没有改选择，请重新输入");
                    }
                }

            } else if (choose.equals("2")) {
                System.out.println("欢迎进入注册页面请输入学生姓名");
                String stuName = scanner.next();
                System.out.println("请输入学生ID");
                String stuID = scanner.next();
                //调用班级的添加学生方法即可，添加成功后记得输出添加进去的学生学号
                Student student = new Student(stuID, stuName);
//                System.out.println(student);
                banJi.addStudent(student);
                System.out.println("当前班级人数"+banJi.getStuCount());
            } else if (choose.equals("3")) {
                System.out.println("欢迎进入学生删除界面，可以删除的学生信息如下：");
                //这里要把班级的全部学生展示出来，根据输入的学生学号删除学生信息
                System.out.println(banJi);
                String stuNo = scanner.next();
                banJi.delStudent(stuNo);
            } else if (choose.equals("4")) {
                System.out.println("班级选课情况如下：");
                //展示班级所有课程被选择次数
                banJi.SumCourse();
            } else if (choose.equals("5")) {
                System.out.println("欢迎下次光临");
                break main1;
            } else {
                System.out.println("改系统没有改选择，请重新输入");
            }
        }
    }
}
