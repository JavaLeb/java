package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
