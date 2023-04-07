package day4.part2;

/**
 * ccb
 **/
public class ParentClass {
    String name ;

    public ParentClass(String name) {
        this.name = name;
    }

    public ParentClass() {
    }

    public void input(){
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
