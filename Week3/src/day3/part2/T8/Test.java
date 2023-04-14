package day3.part2.T8;

/**
 * ccb
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course("c001", "Java");
        Course course1 = new Course("c002", "Web");
        Course course2 = new Course("c003", "IOS");
        Student student =new Student("s001","ccb");
        Student student1 =new Student("s002","bbc");
        Student student2 =new Student("s003","hk");
        student.addCourse(course);student.addCourse(course1);student.addCourse(course2);
        student1.addCourse(course);student1.addCourse(course2);
        student2.addCourse(course1);student2.addCourse(course2);
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        StudentClass studentClass = new StudentClass("A101","教室A101");
        studentClass.addStudent(student);
        studentClass.addStudent(student1);
        studentClass.addStudent(student2);
        System.out.println(studentClass);
    }
}
