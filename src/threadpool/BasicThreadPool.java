package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
public class BasicThreadPool implements ThreadPool {
    private int initSize;
    private int maxSize;
    private int coreSize;
    private int activeCount;
    private ThreadFactory threadFactory;
    private RunnableQueue runnableQueue;
    private volatile boolean isShutdown = false;
    private Thread thread;

    @Override
    public void execute(Runnable runnable) {
        if(this.isShutdown){
            throw new IllegalStateException("The thread pool is destroyed");
        }
        this.runnableQueue.offer(runnable);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public int getInitSize() {
        return 0;
    }

    @Override
    public int getMaxSize() {
        return 0;
    }

    @Override
    public int getCoreSize() {
        return 0;
    }

    @Override
    public int getQueueSize() {
        return 0;
    }

    @Override
    public int getActiveCount() {
        return 0;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }
}
