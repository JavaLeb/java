package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public class RefineSynchronizedLazySingleton {
    private int a = 8;

    //构造方法私有化：不允许外部new实例化
    private RefineSynchronizedLazySingleton() {
    }

    //定义实例，不直接初始化
    private static /*volatile*/ RefineSynchronizedLazySingleton singleton = null;

    //方法中实例化
    public static RefineSynchronizedLazySingleton getInstance() {
        if (singleton == null) {
            synchronized (RefineSynchronizedLazySingleton.class) {
                if (singleton == null) {
                    singleton = new RefineSynchronizedLazySingleton();
                }
            }
        }

        return singleton;
    }

    public int getA() {
        return this.a;
    }
}
