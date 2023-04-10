package day5.part2.T2;

/**
 * ccb
 **/
public class Person {
    private String PName;
    //methods
    public void sing(String song){
        System.out.println(PName +
                "正在演唱" +song+
                "歌曲");
    }
    //constructor
    public Person(String PName) {
        this.PName = PName;
    }
}
