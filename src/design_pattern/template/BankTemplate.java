package design_pattern.template;

/**
 * Created by leboop on 2020/5/24.
 */
public abstract class BankTemplate {
    // 取号排队
    public abstract void takeLineup();

    // 办理业务
    public abstract void handleBuss();

    //    服务评价
    public abstract void evaluateService();

    //模板方法
    public void process() {
        takeLineup();
        handleBuss();
        evaluateService();
    }

}
