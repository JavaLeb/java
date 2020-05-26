package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public class EagerSingleton {
    // static：getInstance方法是静态方法，只能调用静态变量
    // final：不允许类的内部对该实例进行修改，保证单例
    // getInstance未调用前，类加载的时候instance已经被实例化，实例化的有点着急，所以有些地方称之为“饿汉式”
    private final static EagerSingleton INSTANCE = new EagerSingleton();

    //private：私有化构造方法，不允许类的外部使用new创建实例
    private EagerSingleton() {
    }

    public void getInfo(){
        System.out.println("info");
    }

    //static声明方法的原因：外部无法创建类的实例，只能通过类来调用方法
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}


/**
 * 主函数入口，测试单例
 */
class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        //输出true
        System.out.println(singleton1 == singleton2);
    }
}
