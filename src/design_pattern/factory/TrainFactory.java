package design_pattern.factory;

/**
 * Created by leboop on 2020/5/23.
 */
public class TrainFactory extends AbstractFactory {
    @Override
    Movable create() {

        /*
         * 创建对象前的一些预处理
         */
        Train train = new Train();
        /*
         * 创建对象后的一些预处理
         */
        return train;
    }
}
