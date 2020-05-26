package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class StaticFactoryMain {
    public static void main(String[] args) {
        Movable car=StaticFactory.createCar();
        car.go();
        Movable bike=StaticFactory.createBike();
        bike.go();
    }
}
