package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class SimpleFactory {
    public  Car createCar() {
        /*
         * 创建对象前的一些预处理
         */
        Car car = new Car();
        /*
         * 创建对象后的一些预处理
         */

        return car;
    }

    public Bike createBike() {
        /*
         * 创建对象前的一些预处理
         */
        Bike bike = new Bike();
        /*
         * 创建对象后的一些预处理
         */
        return bike;
    }
}
