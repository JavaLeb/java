package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
public interface ThreadPool {
    void execute(Runnable runnable);
    void shutdown();
    int getInitSize();
    int getMaxSize();
    int getCoreSize();
    int getQueueSize();
    int getActiveCount();
    boolean isShutdown();
}
