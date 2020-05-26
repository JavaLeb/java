package design_pattern.proxy.cglib;

import design_pattern.proxy.dynamic.StarBroker;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by leboop on 2020/5/25.
 */
public class CglibMain {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ClassicalStar.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                StarBroker.preSing();
                Object result = proxy.invokeSuper(obj, args);
                StarBroker.afterSing();

                return result;
            }
        });
        ClassicalStar star = (ClassicalStar) enhancer.create();
        star.sing("江南style");
    }
}
