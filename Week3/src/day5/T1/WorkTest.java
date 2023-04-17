package day5.T1;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.IIOException;
import java.io.*;

public class WorkTest {
    /*# 1 通过try-catch和方法体外2种方式处理com.test.WorkTest让其不报错*/
    public static void main(String[] args) {
        String filePath = "E:" + File.separator + "HelloWorld.java";
        //可能发生异常的语句
        try {
            InputStream inputStream = new FileInputStream(filePath);
            inputStream.read();//遇到异常，将异常对象交给exception对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("这是报错1");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("这是报错2");
        }
    }
}
