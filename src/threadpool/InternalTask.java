package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
public class InternalTask implements Runnable {
    private RunnableQueue runnableQueue;
    private volatile boolean running = true;

    public InternalTask(RunnableQueue runnableQueue) {
        this.runnableQueue = runnableQueue;
    }

    @Override
    public void run() {
        while (running && !Thread.currentThread().isInterrupted()) {
            try {
                Runnable task = runnableQueue.take();
                task.run();
            } catch (Exception e) {
                running = false;
                break;
            }

        }
    }

    public void stop() {
        this.running = false;
    }
}
