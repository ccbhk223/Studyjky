package day2.part4.T1;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Course course1 = new Course("s001","Java","2007-02-08","Java学科，包含JavaSE和JavaEE");
        Course course2 = new Course("s002","IOS","2007-02-09","IOS系统开发");
        Teacher teacher1 = new Teacher("too1","薛之谦","男",26,course1);
        Teacher teacher2 = new Teacher("too2","张碧晨","女",24,course2);
        Teacher teacher3 = new Teacher("too3","张杰","男",28,course1);
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(teacher3.toString());
        System.out.println(course1.toString());
        System.out.println(course2.toString());

    }
}
