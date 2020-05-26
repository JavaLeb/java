package thread;

/**
 * Created by leboop on 2018/11/18.
 */
public class Eight {
    public static void main(String[] args) {
        System.out.println(count(0b101));
    }

    public static int count(int num) {
        int counter = 0;
        while (num > 0) {
            counter += num & 0X01;
            num >>= 1;
        }
        return counter;
    }
}
