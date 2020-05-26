package threadgroup;

import java.util.concurrent.TimeUnit;

/**
 * Created by leboop on 2018/11/26.
 */
public class ThreadGroupEnumerateThreads {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("MyGroup");
        Thread thread = new Thread(myGroup, () -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"MyThread");
        thread.start();

        try {
            TimeUnit.MILLISECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();

        Thread[] list=new Thread[mainGroup.activeCount()];
        int recurseSize=mainGroup.enumerate(list);
        System.out.println(recurseSize);
        for(Thread t:list){
            System.out.println(t.getName());
        }
        recurseSize=mainGroup.enumerate(list,false);
        System.out.println(recurseSize);
        for(Thread t:list){
            System.out.println(t.getName());
        }
    }
}
