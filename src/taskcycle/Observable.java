package taskcycle;

/**
 * Created by leboop on 2018/11/27.
 */
public interface Observable {
    enum Cycle {
        STARTED, RUNNING, DONE, ERROR
    }

    Cycle getCycle();

    void start();

    void interrupt();
}
