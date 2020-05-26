package design_pattern.proxy.dynamic;


import design_pattern.proxy.statics.IStar;
import design_pattern.proxy.statics.PopStar;

/**
 * Created by leboop on 2020/5/25.
 */
public class DynamicProxyMain {
    public static void main(String[] args) {
//        真实对象
        IStar star = new PopStar();
//        代理对象
        IStar starProxy = (IStar) ProxyFactory.getProxy(star);
        starProxy.sing("江南style");
    }
}
