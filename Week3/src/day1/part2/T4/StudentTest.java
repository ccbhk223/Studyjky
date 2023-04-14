package day1.part2.T4;

/**
 * ccb
 **/
public class StudentTest {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student = new Student("s001","ccb","male");
        Student student1 = new Student("s002","bbc","male");
        Student student2 = new Student("s003","hk","female");
        Student student3 = new Student("s003","hk","female");
//        System.out.println(student);
        studentController.addStudent(student);
        studentController.addStudent(student1);
        studentController.addStudent(student2);
        studentController.addStudent(student3);
        studentController.outStudentController();
        System.out.println("————————————————————————");
        studentController.delStudent("s001");
        studentController.delStudent("s004");
        studentController.outStudentController();
        System.out.println("————————————————————————");
        studentController.updateStudent(new Student("s001","ccbbbbbbbb","male"));
        studentController.updateStudent(new Student("s0010","ccccccccb","male"));
        studentController.outStudentController();
        System.out.println("————————————————————————");
        System.out.println(studentController.selectStudent("s001"));

    }
}
