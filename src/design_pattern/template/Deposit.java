package design_pattern.template;

/**
 * Created by leboop on 2020/5/24.
 */
public class Deposit extends BankTemplate {
    @Override
    public void takeLineup() {
        System.out.println("个人业务取号排队");
    }

    @Override
    public void handleBuss() {
        System.out.println("存款1000万！");
    }

    @Override
    public void evaluateService() {
        System.out.println("服务 very good！");
    }
}
