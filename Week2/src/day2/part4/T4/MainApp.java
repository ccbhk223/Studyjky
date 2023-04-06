package day2.part4.T4;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Student student1 = new Student("ccb",12,"Java");
        Student student2 = new Student();
        student2.setSName("bbc");
        student2.setSAge(10);
        student2.setSContent("IOS");
        Teacher teacher1 = new Teacher("hk",40,"IOS");
        Teacher teacher2 = new Teacher();
        teacher2.setTName("kh");
        teacher2.setTAge(50);
        teacher2.setTContent("Java");
        student1.eat();
        student1.study();
        student2.eat();
        student2.study();
        teacher1.eat();
        teacher1.teach();
        teacher2.eat();
        teacher2.teach();
    }
}
