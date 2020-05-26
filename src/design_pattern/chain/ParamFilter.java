package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public class ParamFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String param=request.getParam();
        if("prefix".equals(param)){
            response.setData("prefix"+response.getData());
        }

        filterChain.doFilter(request, response);
    }

}
