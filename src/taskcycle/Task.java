package taskcycle;

/**
 * Created by leboop on 2018/11/27.
 */
@FunctionalInterface
public interface Task<T> {
    T call();
}
