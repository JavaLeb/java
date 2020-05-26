package thread;

/**
 * Created by leboop on 2018/11/19.
 */
public class TicketWindowRunnable implements Runnable {
    private final static int MAX = 50;
    private int index = 1;

    @Override
    public void run() {
        while (index<MAX){
            System.out.println(Thread.currentThread()+" 的号码是"+(index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final TicketWindowRunnable task=new TicketWindowRunnable();
        Thread t1=new Thread(task,"一号");
        Thread t2=new Thread(task,"二号");
        Thread t3=new Thread(task,"三号");
        Thread t4=new Thread(task,"四号");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
