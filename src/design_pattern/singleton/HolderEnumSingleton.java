package design_pattern.singleton;

/**
 * Created by leboop on 2018/11/27.
 */
public class HolderEnumSingleton {
    //构造方法私有化
    private HolderEnumSingleton() {
    }
    //使用enum枚举充当Holder
    private enum EnumHolder {
        INSTANCE;
        private HolderEnumSingleton instance;

        EnumHolder() {
            this.instance = new HolderEnumSingleton();
        }

        private HolderEnumSingleton getSingleton() {
            return instance;
        }
    }
    //获取单例
    public static HolderEnumSingleton getInstance() {
        return EnumHolder.INSTANCE.getSingleton();
    }
}
