package design_pattern.proxy.statics;

/**
 * Created by leboop on 2020/5/25.
 */
public class StarProxy implements IStar {
    private IStar star;

    public StarProxy() {
    }

    public StarProxy(IStar star) {
        this.star = star;
    }

    @Override
    public void sing(String songName) {
        preSing();
        star.sing(songName);
        afterSing();
    }

    public void preSing() {
        System.out.println("preparation before singing");
    }

    public void afterSing() {
        System.out.println("some work after singing");
    }
}
