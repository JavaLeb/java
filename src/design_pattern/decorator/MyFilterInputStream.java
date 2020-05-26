package design_pattern.decorator;

import java.util.regex.Pattern;

/**
 * Created by leboop on 2020/5/25.
 */
public class MyFilterInputStream extends MyInputStream {
    private MyInputStream in;

    public MyFilterInputStream(MyInputStream in) {
        this.in = in;
    }

    @Override
    public int read(String content) {
//        扩展的功能
        String s="";
        if (content != null) {
            s=Pattern.compile("[0-9]").matcher(content).replaceAll("");
        }

        return in.read(s);
    }
}
