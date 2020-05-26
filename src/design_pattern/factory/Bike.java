package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class Bike implements Movable {
    @Override
    public void go() {
        System.out.println("Bike going!");
    }
}
