package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public class Response {
    String data="";

    public Response() {
    }

    public Response(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyResponse{" +
                "data='" + data + '\'' +
                '}';
    }
}
