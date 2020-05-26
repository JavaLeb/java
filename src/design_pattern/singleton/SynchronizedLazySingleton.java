package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public class SynchronizedLazySingleton {
    //构造方法私有化：不允许外部new实例化
    private SynchronizedLazySingleton() {
    }

    //定义实例，不直接初始化
    private static SynchronizedLazySingleton singleton = null;

    //方法中实例化
    public static synchronized SynchronizedLazySingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedLazySingleton();
        }

        return singleton;
    }
}
