package design_pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by leboop on 2020/5/25.
 */
public class ProxyFactory {
    public static Object getProxy(Object target) {

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, methodArgs) -> {
                    if ("sing".equals(method.getName())) {
                        StarBroker.preSing();
                        Object object = method.invoke(target, methodArgs);
                        StarBroker.afterSing();
                        return object;
                    }
                    return null;
                });
    }
}
