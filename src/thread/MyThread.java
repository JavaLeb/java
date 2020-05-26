package thread;

/**
 * Created by leboop on 2018/11/19.
 */
public class MyThread extends Thread {
    @Override
    public synchronized void start() {
        System.out.println("重写了");
//        super.start();
    }

    @Override
    public void run() {
        System.out.println("asdfasdfadf");
    }

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
