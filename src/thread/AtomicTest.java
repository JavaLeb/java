package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by leboop on 2018/11/25.
 */
public class AtomicTest {
    public static AtomicInteger race = new AtomicInteger(0);

    public static void increase() {
        race.incrementAndGet();
    }

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(() ->
            {
                for (int j = 0; j < 10000; j++) {
                    increase();
                }
            }).start();
        }

        while (Thread.activeCount()>2){

        }
        System.out.println(race);
    }
}
