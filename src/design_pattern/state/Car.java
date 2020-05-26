package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class Car {

    public void go(Color color){
        switch (color){
            case RED:
                System.out.println(Thread.currentThread().getName()+"：car stopping");
                break;
            case GREEN:
                System.out.println(Thread.currentThread().getName()+"：car going");
                break;
            case YELLOW:
                System.out.println(Thread.currentThread().getName()+"：car waiting");
                break;
        }
    }
}
