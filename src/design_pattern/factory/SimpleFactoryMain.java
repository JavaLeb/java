package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Movable car = factory.createCar();
        car.go();
        Movable bike = factory.createBike();
        bike.go();
    }
}
