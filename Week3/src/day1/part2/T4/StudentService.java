package day1.part2.T4;

/**
 * ccb
 **/
public interface StudentService {//业务逻辑层 抽象方法

    public void addStudent(Student student);//增加学生信息

    public void delStudent(String SNo);//删除学生信息

    public void updateStudent(Student student);//更新学生信息

    public Student selectStudent(String SNo);//查询学生信息

}
