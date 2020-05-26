package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public class HolderSingleton {

    private HolderSingleton(){}

    private static class Holder{
        private static HolderSingleton holderSingleton=new HolderSingleton();
    }

    private static HolderSingleton getInstance(){
        return Holder.holderSingleton;
    }
}
