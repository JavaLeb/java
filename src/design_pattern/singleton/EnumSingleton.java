package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public enum EnumSingleton {
    SINGLETON;

    EnumSingleton() {
        System.out.println("SINGLETON将被初始化");
    }

    public static void method() {
        System.out.println("method的方法被调用");
    }

    public static EnumSingleton getInstance() {
        return SINGLETON;
    }
}
