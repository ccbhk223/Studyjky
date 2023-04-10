package day5.part2.T3;

/**
 * ccb
 **/
public class Person {
    private String PName;
    //methods
    public void readBook(Book book){
        System.out.println(PName+"正在看" +book.getBName()+
                "小说");
    }
    //constructor

    public Person(String PName) {
        this.PName = PName;
    }
}
