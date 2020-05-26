package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public class LogFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
//        当前filter处理逻辑：在response后追加.log
        String data = response.getData();
        if (data.startsWith("prefix")) {
            response.setData(data + ".log");
        }

//        进入下一个filter处理
        filterChain.doFilter(request, response);
    }

}
