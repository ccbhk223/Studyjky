package day4.part2;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("ccb");
        parentClass.input();
        ChildClass childClass = new ChildClass("bbc");
        parentClass.input();
        childClass.input();
    }
}
