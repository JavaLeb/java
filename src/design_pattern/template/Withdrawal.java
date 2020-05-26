package design_pattern.template;

/**
 * Created by leboop on 2020/5/24.
 */
public class Withdrawal extends BankTemplate{
    @Override
    public void takeLineup() {
        System.out.println("取个人取款业务号排队……");
    }

    @Override
    public void handleBuss() {
        System.out.println("取款1个亿！");
    }

    @Override
    public void evaluateService() {
        System.out.println("服务 very nice！");
    }
}
