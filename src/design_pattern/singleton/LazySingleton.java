package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 * final修饰：不可被其他类继承
 */
public class LazySingleton {
    //定义实例，不直接初始化
    //不能使用final修饰，也带来了一定的隐患，类的内部其他地方可以修改该实例
    private  static LazySingleton instance = null;

    //构造方法私有化：不允许外部new实例化
    private LazySingleton() {
    }

    //方法中实例化,没被实例化时才实例化
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

class LazySingletonMain {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        //输出true
        System.out.println(singleton1 == singleton2);
    }
}