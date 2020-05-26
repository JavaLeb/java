package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
@FunctionalInterface
public interface ThreadFactory {
    Thread createThread(Runnable runnable);
}
