package day2.part3.T1;

/**
 * ccb
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStuName("ccb");
        student.setStuNo("01");
        student.setStuAge(23);
        System.out.println(student.toString());
        Student student1 = new Student("bbc","02",20);
        System.out.println(student1.toString());
    }
}
