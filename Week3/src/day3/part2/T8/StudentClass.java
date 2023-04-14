package day3.part2.T8;

import java.util.Arrays;

/**
 * ccb
 **/
public class StudentClass {
    private String classNo;
    private String className;
    private Student[] students;
    private int studentCount = 0;

    @Override
    public String toString() {
        return "班级{" +
                "班级编号='" + classNo + '\'' +
                ", 班级名='" + className + '\'' +
                ", 学生信息=" + Arrays.toString(students) +
                ", 学生数量=" + studentCount +
                '}';
    }

    //methods
    public  void addStudent(Student student) {
        students[studentCount]= student;
        studentCount ++;
    }
    //constructor

    public StudentClass() {
//        students = new Student[10];
    }

    public StudentClass(String classNo, String className) {
        this.classNo = classNo;
        this.className = className;
        students = new Student[10];
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
