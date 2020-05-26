package thread;

/**
 * Created by leboop on 2018/11/24.
 */
public class VolatileTest {
    private static volatile int race = 0;

    private static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increase();
                }
            });
            threads[i].start();
        }


        while (Thread.activeCount() > 2) {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            Thread[] arrayList=new Thread[threadGroup.activeCount()];
            threadGroup.enumerate(arrayList);

            System.out.println("活跃线程数：" + Thread.activeCount());
            System.out.println("=============");
            for (int i=0;i<arrayList.length;i++){
                System.out.println("活跃线程："+arrayList[i].getName());
            }
            System.out.println("=============");
            Thread.yield();
        }

        System.out.println("race=" + race);
    }
}
