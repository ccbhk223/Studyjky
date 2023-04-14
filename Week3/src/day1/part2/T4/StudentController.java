package day1.part2.T4;

/**
 * ccb
 **/
public class StudentController {
    Student[] students;
    StudentService studentDao;


    //constructor
    public StudentController() {
        students = new Student[3];
        studentDao = new StudentDao(students);
    }

    //methods
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void delStudent(String SNo) {
        studentDao.delStudent(SNo);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public Student selectStudent(String SNo) {
        return studentDao.selectStudent(SNo);
    }

    public void outStudentController() {//输出学生名单
        System.out.println("学生名单：");
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("学生：" + students[i].getSName() +
                        " ，学生编号：" + students[i].getSNo() +
                        " ，学生性别：" + students[i].getSGender());
                j++;
            }
        }
        System.out.println("名单人数：" + j);
    }
}
