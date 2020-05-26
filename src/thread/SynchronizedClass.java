package thread;

/**
 * Created by leboop on 2018/11/18.
 * 测试synchronized关键字使用
 */
public class SynchronizedClass {
    //synchronized修饰的普通方法
    public static   void otherPrint() {
        synchronized(SynchronizedClass.class) {
            System.out.println(Thread.currentThread().getName() + "线程开始执行......");
            run();
            System.out.println(Thread.currentThread().getName() + "线程执行结束......");
        }
    }

    //synchronized修饰的静态方法
    public synchronized static void print() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行......");
        run();
        System.out.println(Thread.currentThread().getName() + "线程执行结束......");
    }

    public static void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程" + Thread.currentThread().getName() + "正在打印i=" + i);
        }
    }

}
