package day3.part2.T8;

import java.util.Arrays;

/**
 * ccb
 **/
public class Student {
    private String stuNo;
    private String stuName;
    private Course[] courses;
    private int courseCount = 0;
    //methods
    public  void addCourse(Course course) {
        courses[courseCount]= course;
        courseCount ++;
    }
    //constructor

    public Student() {

    }

    public Student(String stuNo, String stuName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        courses = new Course[3];

    }


    //toString
    @Override
    public String toString() {
        return "学生{" +
                "学生编号='" + stuNo + '\'' +
                ", 学生名字='" + stuName + '\'' +
                ", 选课信息=" + Arrays.toString(courses) +
                ", 选课数目=" + courseCount +
                '}';
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


}
