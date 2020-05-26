package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public interface FilterChain{
    void doFilter(Request request, Response response);
}
