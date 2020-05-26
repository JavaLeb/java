package design_pattern.chain;

/**
 * Created by leboop on 2020/5/25.
 */
public final class AppFilterChain implements FilterChain {
//    filterchain中当前filter的索引
    private int pos = 0;
//    filterchain中filter数量
    private int n = 0;
//    AppFilterConfig是filter的简单封装，可以看成是filter数组
    private Filter[] filters = new Filter[0];

    @Override
    public void doFilter(Request request, Response response) {
        if(this.pos < this.n) {
            Filter filter = this.filters[this.pos++];
            System.out.println(
                    "start filter:"+filter.getClass().getSimpleName());
            filter.doFilter(request, response, this);
        }else {
            System.out.println("FilterChain is finished");
        }
    }

    public AppFilterChain addFilter(Filter filter) {
        Filter[] newFilters = this.filters;
        int len$ = newFilters.length;
//        检查filter是否已经存在，如果存在不添加，直接返回
        for(int i$ = 0; i$ < len$; ++i$) {
            Filter f = newFilters[i$];
            if(f == filter) {
                return this;
            }
        }
//      检查原有的filter数组是否可以存下新增的filter，如果不行，进行扩容，每次扩容增加10个
        if(this.n == this.filters.length) {
            newFilters = new Filter[this.n + 10];
            System.arraycopy(this.filters, 0, newFilters, 0, this.n);
            this.filters = newFilters;
        }

        this.filters[this.n++] = filter;

        return this;
    }
}
