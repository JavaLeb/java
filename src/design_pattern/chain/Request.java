package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public class Request {
    String param;

    public Request() {
    }

    public Request(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "param='" + param + '\'' +
                '}';
    }
}
