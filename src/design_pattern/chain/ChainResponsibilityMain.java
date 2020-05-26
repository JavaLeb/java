package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public class ChainResponsibilityMain {
    public static void main(String[] args) {
        Request request = new Request("prefix");
        Response response=new Response();
//        初始化两个filter
        Filter logFilter=new LogFilter();
        Filter paramFilter=new ParamFilter();
//        初始化filterchain
        AppFilterChain filterChain=new AppFilterChain();
        filterChain.addFilter(paramFilter).addFilter(logFilter);

        filterChain.doFilter(request,response);

        System.out.println(response.getData());
    }

}
