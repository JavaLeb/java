package thread;

/**
 * Created by leboop on 2018/11/19.
 */
public class TicketWindow extends Thread {
    private String name;
    private final static int MAX = 50;
    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index < MAX) {
            System.out.println("柜台：" + name + "当前号码是：" + (index++));
        }
    }

    public static void main(String[] args) {
        TicketWindow t1=new TicketWindow("一号");
        TicketWindow t2=new TicketWindow("二号");
        TicketWindow t3=new TicketWindow("三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
