package day4.part3.T3;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Course course1 = new Course("c001","语文");
        Course course2 = new Course("c002","Java");
        Course course3 = new Course("c003","英语");
        Course course4 = new Course("c004","数学");
        Student student1 = new Student("s001","ccb");
        student1.addSCourse(course1);
        student1.addSCourse(course1);
        student1.addSCourse(course2);
        student1.addSCourse(course3);
        System.out.println(student1);
        System.out.println("学生"+student1.getSName()+"选择的课程有：");
        for (int i = 0; i < student1.getCourseCount(); i++) {
            System.out.println(student1.getSCourse()[i]);
        }
        student1.delSCourse(course4);
        student1.delSCourse(course1);
        System.out.println("删除课程后，学生 "+student1.getSName()+" 选择的课程有：");
        for (int i = 0; i < student1.getCourseCount(); i++) {
            System.out.println(student1.getSCourse()[i]);
        }
    }
}
