package design_pattern.template;

/**
 * Created by leboop on 2020/5/24.
 */
public class TemplateMain {
    public static void main(String[] args) {
        BankTemplate deposit= new Deposit();
        deposit.process();

        BankTemplate withdrawal=new Withdrawal();
        withdrawal.process();
    }
}
