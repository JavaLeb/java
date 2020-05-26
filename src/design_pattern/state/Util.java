package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class Util {
    public static void sleep(int seconds) {
        try {
            int count = 0;
            while (count++ < seconds) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":"+count + "s");
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
