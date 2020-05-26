package thread;

/**
 * Created by leboop on 2018/11/18.
 */
public class ThreadAlternation {

    public static void main(String[] args) {
        final ThreadAlternation alternation = new ThreadAlternation();
        Thread t1 = new Thread(alternation::printEven);
        Thread t2 = new Thread(alternation::printOdd);

        t1.start();
        t2.start();
    }

    public synchronized void printEven() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                // NO
            }
        }
    }

    public synchronized void printOdd() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                // NO
            }
        }
    }


}
