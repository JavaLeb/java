package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
public interface RunnableQueue {
    void offer(Runnable runnable);
    Runnable take() throws InterruptedException;
    int size();
}
