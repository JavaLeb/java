package taskcycle;

/**
 * Created by leboop on 2018/11/27.
 */
public class Test {
    public static void main(String[] args) {
//        Executor;
//        ExecutorService;
//        AbstractExecutorService;
//        Executors;
        Observable observableThread=new ObservableThread<String>(()->{
            return null;
        });
        observableThread.start();
    }
}
