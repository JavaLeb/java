package design_pattern.decorator;

/**
 * Created by leboop on 2020/5/25.
 */
public class MyFileInputStream extends MyInputStream {
    @Override
    public int read(String content) {
        // 模拟读取文件
        int readNum = content.length();

        return readNum;
    }
}
