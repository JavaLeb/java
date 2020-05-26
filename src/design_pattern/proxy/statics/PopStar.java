package design_pattern.proxy.statics;

/**
 * Created by leboop on 2020/5/25.
 */
public class PopStar implements IStar {
    @Override
    public void sing(String songName) {
        System.out.println("sing "+songName);
    }
}
