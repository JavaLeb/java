package thread;

/**
 * Created by leboop on 2018/11/18.
 */
public class SychronizedTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
                //调用synchronized修饰的静态方法
                SynchronizedClass.print();
            }
        });
        t1.setName("t1");


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                //调用无synchronized修饰的静态方法
                SynchronizedClass.otherPrint();
            }
        });
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
