package day4.part3.T3;

/**
 * ccb
 **/
public class Student {
    private String SNo;
    private String SName;
    private Course[] SCourse;//存储学生选择的一门课程
    private String[] courNames = {"语文", "数学", "英语", "Java"};//存放可以选择的课程名称
    private int courseCount = 0;

    //方法
    //添加课程
    public void addSCourse(Course course) {
        String addCourseName = course.getCName();//接收需要添加的课程名字
        String addCourseNO = course.getCNo();//接收需要添加的课程编号
        boolean key1 = true;//判断是否添加过该课程
        boolean key2 = false;//判断是否在选课表内
        for (int i = 0; i < courseCount; i++) {//遍历已选课程找是否添加过
            if (addCourseName.equals(SCourse[i].getCName())) {
                System.out.println("学生 " + SName + " 已经添加过 " + course.getCName() + " 课程,无法再次选择！");
                key1 = false;
                break;
            }
        }
        if (key1) {//遍历课程表数组找是否有该课程
            for (String courName : courNames) {
                if (courName.equals(course.getCName())) {
                    SCourse[courseCount] = course;
                    courseCount++;
                    System.out.println("学生 " + SName + " 选择课程 " + course.getCName() + " 成功！");
                    key2 = true;
                    break;
                }
            }
            if (!key2) System.out.println("没有 " + course.getCName() + " 这门课程，课程选择失败");
        }
    }

    //删除课程
    public Student delSCourse(Course course) {
        boolean isDel =false;
        for (int i = 0; i <courseCount; i++) {
            if (SCourse[i].getCName().equals(course.getCName())&&SCourse[i].getCNo().equals(course.getCNo())) {
                SCourse[i] = SCourse[courseCount-1];
                SCourse[courseCount-1] = null;
                courseCount--;
                System.out.println("学生 " + SName + " 删除课程 " + course.getCName() + " 成功！");
                isDel= true;
                break;
            }
        }
        if (!isDel){
            System.out.println("学生 "+SName + " 未选择课程 " +course.getCName()+",删除课程失败。");
        }
        return this;
    }
    //toString

    @Override
    public String toString() {
        return "学生编号 " + SNo +
                " 学生姓名 " + SName
                ;
    }


    //constructor

    public Student(String SNo, String SName) {
        this.SNo = SNo;
        this.SName = SName;
        SCourse = new Course[4];
    }

    // getter and setter


    public Course[] getSCourse() {
        return SCourse;
    }

    public void setSCourse(Course[] SCourse) {
        this.SCourse = SCourse;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }
}
