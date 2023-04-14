package day2.part1;

public class ParentDemoTest {
    //类数组：类型是类    值是对象
    ParentDemo[] parentDemos = null;//存放操作的任意对象，对象的类型不确定，可以确定的是
    //它们的父类都是ParentDemo
    //已有元素数目
    int count = 0;


    public ParentDemoTest() {
        parentDemos = new ParentDemo[10];
    }

    //将对象信息:ChildDemo/ChildDemo2添加到数组
    public void addParent(ParentDemo parentDemo){//向上
        parentDemos[count] = parentDemo;//不知道放入对象到底哪种子类类型
        this.count++;

    }
    //打印数组的全部元素
    public void printArrays(){
       // System.out.println(Arrays.toString(parentDemos));
        //每一个对象中独有元素信息
        for (int i = 0; i <this.count ; i++) {
            ParentDemo parentDemo = parentDemos[i];//向上
            //类型判断：对象名  instanceof  类名
            if(parentDemo instanceof ChildDemo){
                ChildDemo childDemo = (ChildDemo)parentDemo;
                childDemo.out();
                System.out.println("ChildDemo中独有属性："+childDemo.getA());
            }
            else if(parentDemo instanceof ChildDemo2){
                ChildDemo2 childDemo2 = (ChildDemo2)parentDemo;
                System.out.println("ChildDemo2中独有属性："+childDemo2.getB());
            }
        }

    }


    //从某个数组删除对象
    public  void deleteParent(ParentDemo parentDemo){//向上
        //只有是ChildDemo类型的我们才允许删除
        for (int i = 0; i < this.count; i++) {
            if (parentDemo instanceof ChildDemo){
                parentDemos[i]=parentDemos[count-1];
                parentDemos[count-1] = null;
                System.out.println("已删除" +parentDemo);
                count--;
                break;
            }else if(parentDemo instanceof ChildDemo2){
                parentDemos[i]=parentDemos[count-1];
                parentDemos[count-1] = null;
                System.out.println("已删除" +parentDemo);
                count--;
                break;
            }
        }
    }
    public void updataParent(ParentDemo parentDemo){//改子类
        for (int i = 0; i < this.count; i++) {
            if (parentDemo instanceof ChildDemo) {
                System.out.print("已修改" +parentDemo+
                        " 为 ");
                parentDemo = new ChildDemo2();
                parentDemos[i] = parentDemo;
                System.out.println(parentDemo);
                break;
            }else if (parentDemo instanceof ChildDemo2){
                System.out.print("已修改" +parentDemo+
                        " 为 ");
                parentDemo = new ChildDemo();
                parentDemos[i] = parentDemo;
                System.out.println(parentDemo);
                break;
            }
        }
    }
    public ParentDemo selectParent(int x){//查询子类
        for (int i = 0; i < count; i++) {
            if (parentDemos[i] instanceof ChildDemo){
                if (((ChildDemo)parentDemos[i]).getA()==x)return parentDemos[i];
            }else if (parentDemos[i] instanceof ChildDemo2){
                if (((ChildDemo2)parentDemos[i]).getB()==x) return parentDemos[i];
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ParentDemoTest parentDemoTest = new ParentDemoTest();
        ParentDemo parentDemo = new ChildDemo();
        parentDemoTest.addParent(parentDemo);
        ParentDemo parentDemo1 = new ChildDemo2();
        parentDemoTest.addParent(parentDemo1);
        ParentDemo parentDemo2 = new ChildDemo2();
        parentDemoTest.addParent(parentDemo2);

        parentDemoTest.printArrays();
        System.out.println("——————————————————");
        parentDemoTest.deleteParent(parentDemo);
        parentDemoTest.printArrays();
        System.out.println("——————————————————");
        parentDemoTest.updataParent(parentDemo1);
        parentDemoTest.printArrays();
        System.out.println("——————————————————");
        System.out.println(parentDemoTest.selectParent(111));

    }
}
