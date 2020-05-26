package design_pattern.decorator;

import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 * Created by leboop on 2020/5/25.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        MyInputStream inputStream=new MyFilterInputStream(new MyFileInputStream());
        String content="12adb";
        int num=inputStream.read(content);
        System.out.println("文件内容长度："+content.length());
        System.out.println("实际读取的文件内容长度："+num);
    }
}
