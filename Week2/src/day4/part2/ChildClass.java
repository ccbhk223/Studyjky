package day4.part2;

/**
 * ccb
 **/
public class ChildClass extends ParentClass{
    public ChildClass(String name) {
        super(name);
    }
    public  ChildClass(){
    }

    @Override
     public void input() {
        System.out.println(super.name);
    }
}
