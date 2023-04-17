package day5;

/**
 * ccb
 **/
class MyException extends Exception{
    @Override
    public void printStackTrace() {
        System.err.println("你输入有问题");
    }
}
public class T2 {
    /*# 2 编写自定义异常MyException类重写打印错误信息方法实现打印"你输入有问题“*/
    public static void main(String[] args) {
        try {
            MyException myException = new MyException();
            System.out.println("111");
            throw myException;
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
