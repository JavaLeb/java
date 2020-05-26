package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Movable car=carFactory.create();
        car.go();

        BikeFactory bikeFactory=new BikeFactory();
        Movable bike=bikeFactory.create();
        bike.go();

        TrainFactory trainFactory=new TrainFactory();
        Movable train=trainFactory.create();
        train.go();
    }
}
