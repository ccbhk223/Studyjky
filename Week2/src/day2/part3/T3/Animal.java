package day2.part3.T3;

/**
 * ccb
 **/
public class Animal {
    private String aniName;
    private int aniAge;

    public void setAniAge(int aniAge) {
        this.aniAge = aniAge;
    }

    public void setAniName(String aniName) {
        this.aniName = aniName;
    }

    public String getAniName() {
        return aniName;
    }

    public int getAniAge() {
        return aniAge;
    }

    public Animal(String aniName, int aniAge) {
        this.aniName = aniName;
        this.aniAge = aniAge;
    }
    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "aniName='" + aniName + '\'' +
                ", aniAge=" + aniAge +
                '}';
    }
}
