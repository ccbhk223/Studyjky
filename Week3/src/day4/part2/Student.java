package day4.part2;
import java.util.Arrays;

public class Student {
    private String stuNo;
    private String stuName;
    private  Course[] courses;//可以选择的所有课程
    private int couCount = 0;//学生已经选择的课程门数


    public void addCourse(Course course) {
        //课程是否选择过
        boolean isInCourses = false;
        for (int i = 0; i < couCount; i++) {
            if (course.getCouNo().equals(courses[i].getCouNo())) {
                System.out.println("学生已经选择过此门课程");
                isInCourses =true;
                break;
            }
        }
        if (!isInCourses) {
            courses[couCount] = course;
            System.out.println("学生选择课程"+course.getCouName()+"成功！");
            couCount++;
        }
    }


    //退选：根据课程名或者编号退选
    public void delCourse(Course course) {
        //课程是否在选课内
        boolean isInCourses = false;
        for (int i = 0; i < couCount; i++) {
            if (course.getCouNo().equals(courses[i].getCouNo())) {
                courses[i]=courses[couCount-1];
                courses[couCount-1]=null;
                isInCourses =true;
                System.out.println("删除课程"+course.getCouName()+"成功");
                couCount--;
                break;
            }
        }
        if (!isInCourses) {
            System.out.println("学生没有选择过这门课程");
        }
    }

    //constructor

    public Student(String stuNo, String stuName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        courses = new Course[10];
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", couCount=" + couCount +
                '}';
    }
//set get

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

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int getCouCount() {
        return couCount;
    }

    public void setCouCount(int couCount) {
        this.couCount = couCount;
    }
}
