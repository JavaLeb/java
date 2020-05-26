package threadpool;

/**
 * Created by leboop on 2018/11/26.
 */
public class RunnableDenyPolicyException extends  RuntimeException {
    public RunnableDenyPolicyException(String message) {
        super(message);
    }
}
