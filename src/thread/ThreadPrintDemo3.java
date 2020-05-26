package thread;

/**
 * Created by leboop on 2018/11/18.
 */
public class ThreadPrintDemo3 {

    static volatile int num = 0;
    static volatile boolean flag = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (100 > num) {
                if (!flag && (num % 2 == 0)) {
                    System.out.println(num++);
                    flag = true;
                }
            }
        }
        );

        Thread t2 = new Thread(() -> {
            while (100 > num) {
                if (flag && (num % 2 != 0)) {
                    System.out.println(num++);
                    flag = false;
                }
            }
        }
        );

        t1.start();
        t2.start();

    }
}
