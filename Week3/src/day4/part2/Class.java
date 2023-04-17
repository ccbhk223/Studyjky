package day4.part2;


import java.util.Arrays;

public class Class {
    private String classNo;
    private String className;
    private Student[] students;
    private String[] allCourses = {"java","c","c+","语文"};
    private int stuCount = 0;//已有学生人数

    public Class() {
        students = new Student[100];
    }

    public Class(String classNo, String className) {
        this.classNo = classNo;
        this.className = className;
        students = new Student[100];
    }

    //添加学生
    public void addStudent(Student student) {
        //学生是否在班级内
        boolean isOnClass = false;
        for (int i = 0; i < stuCount; i++) {
            if (student.getStuNo().equals(students[i].getStuNo())) {
                System.out.println("学生已经在该班级内");
                isOnClass =true;
                break;
            }
        }
        if (!isOnClass) {
            System.out.println(student);
            students[stuCount] = student;
            System.out.println("学生" +student.getStuNo()+
                    "添加到"+className+"成功！");
            stuCount++;
        }
    }
    //删除学生：根据学生学号删除课程信息
    public void delStudent(String stuNo) {
        //学生是否在班级内
        boolean isInClass = false;
        for (int i = 0; i < stuCount; i++) {
            if (stuNo.equals(students[i].getStuNo())) {
                System.out.println("删除学生ID"+stuNo+"成功");
                students[i]=students[stuCount-1];
                students[stuCount-1]=null;
                isInClass =true;
                stuCount--;
                break;
            }
        }
        if (!isInClass) {
            System.out.println("班级内没有这个学生！");
        }
    }
    //统计课程选择情况
    public void SumCourse(){
        for (String allCours : allCourses) {
            int count = 0;
            for (int j=0;j<getStuCount();j++) {
                for (int k = 0; k < students[j].getCouCount(); k++) {
                    if (students[j].getCourses()[k].getCouName().equals(allCours)) {
                        count++;
                    }
                }
            }
            System.out.println("课程" + allCours + "被选择了" + count + "次");
        }
    }

    @Override
    public String toString() {
        return "教室：" +
                "教室编号：" + classNo +
                ", 教室名字：" + className + "\n"+
                "学生：" + Arrays.toString(students) +"\n"+
                ", 班级总人数：" + stuCount ;
    }


    //get set

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStuCount() {
        return stuCount;
    }

    public void setStuCount(int stuCount) {
        this.stuCount = stuCount;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String[] getAllCourses() {
        return allCourses;
    }

    public void setAllCourses(String[] allCourses) {
        this.allCourses = allCourses;
    }
}
