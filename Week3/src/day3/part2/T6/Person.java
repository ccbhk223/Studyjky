package day3.part2.T6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ccb
 **/
public class Person {

    private String name;
    private String personID;
    private Calendar birthday;
    private Sex sex;

    public Person(String name, String personID, Calendar birthday, Sex sex) {
        this.name = name;
        this.personID = personID;
        this.birthday = birthday;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名：" + name +
                ", 身份证号码：" + personID +
                ", 出生日期：" + formatBirth(birthday) +
                ", 性别：" + sex.gender;
    }
    private String formatBirth(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(birthday.getTime());
    }
}
