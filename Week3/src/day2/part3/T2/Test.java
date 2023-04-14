package day2.part3.T2;

/**
 * ccb
 **/
public class Test implements AddSalary{
    @Override
    public void add(Person person) {
        if (person instanceof Manager){
            ((Manager)person).setWage(((Manager)person).getWage()*1.2);
        }else if (person instanceof  Employee){
            ((Employee)person).setWage(((Employee)person).getWage()*1.1);
        }
    }
}
