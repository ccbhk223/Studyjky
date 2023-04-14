package day1.part2.T4;

/**
 * ccb
 **/
public class StudentDao implements StudentService {//业务实现层
    Student[] students;
    private int studentCount=0;

    public StudentDao(Student[] students) {
        this.students=students;
    }

    @Override
    public void addStudent(Student student) {//增加学生信息功能
        System.out.println("正在使用增加学生信息功能");
        boolean key = false;
        for (int i = 0; i < studentCount; i++) {//查看是否在学生名单中
            if (student.getSNo().equals(students[i].getSNo())){
                key =true;
                System.out.println("添加失败！该学生已在学生名单中！");
                break;
            }
        }
        if (!key){
            students[studentCount] = student;
            studentCount++;
            System.out.println("添加信息成功（学生编号：" +student.getSNo()+
                    "，学生姓名：" +student.getSName()+
                    "，学生性别：" +student.getSGender()+
                    "）");
        }

    }

    @Override
    public void delStudent(String  SNo) {//删除学生信息功能
        System.out.println("正在使用删除学生信息功能");
        boolean key = false;
        for (int i = 0; i <studentCount ; i++) {//查看是否在学生名单中
            if (SNo.equals(students[i].getSNo())){
                key =true;
                students[studentCount-1] = students[i];
                students[studentCount-1] = null;
                System.out.println("删除信息成功！（学生编号：" +students[i].getSNo()+
                        "，学生姓名：" +students[i].getSName()+
                        "，学生性别：" +students[i].getSGender()+
                        "）");
                studentCount--;
                break;
            }
        }
        if (!key){
            System.out.println("删除失败！该学生(学生编号：" +SNo+
                    ")未在学生名单中！");
        }
    }

    @Override
    public void updateStudent(Student student) {//更新学生信息功能
        System.out.println("正在使用更新学生信息功能");
        boolean key = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getSNo().equals(student.getSNo())){
                key = true;
                System.out.print("修改信息成功！（学生编号：" +students[i].getSNo()+
                        "，学生姓名：" +students[i].getSName()+
                        "，学生性别：" +students[i].getSGender()+
                        "）" +
                        "——————>" );
                students[i].setSName(student.getSName());
                students[i].setSGender(student.getSGender());
                System.out.println("（学生编号：" +students[i].getSNo()+
                        "，学生姓名：" +students[i].getSName()+
                        "，学生性别：" +students[i].getSGender()+
                        "）");
                break;
            }
        }
        if (!key){
            System.out.println("修改失败！该学生(学生编号：" +student.getSNo()+
                    ")未在学生名单中！");
        }

    }

    @Override
    public Student selectStudent(String  SNo) {//查询学生信息功能
        System.out.println("正在使用查询学生信息功能:");
        int studetIndex = 0;
        for (int i = 0; i <studentCount ; i++) {
            if (SNo.equals(students[i].getSNo())){
                studetIndex =i;
//                System.out.print("查询信息成功！（学生编号：" +students[i].getSNo()+
//                        "，学生姓名：" +students[i].getSName()+
//                        "，学生性别：" +students[i].getSGender()+
//                        "）" );
                break;
            }
        }
        return students[studetIndex];
    }
}
