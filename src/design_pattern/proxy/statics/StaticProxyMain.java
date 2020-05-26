package design_pattern.proxy.statics;




/**
 * Created by leboop on 2020/5/25.
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        IStar star=new PopStar();
        StarProxy starProxy=new StarProxy(star);
        starProxy.sing("江南style");
    }
}
