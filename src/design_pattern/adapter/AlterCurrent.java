package design_pattern.adapter;

/**
 * Created by leboop on 2020/5/26.
 * 交流电：无法修改电路（无法修改其源码）
 */
public class AlterCurrent {
    //    电压
    private String voltage = "220V交流电";

    /**
     * 向外输出220V交流电
     */
    public void outAC() {
        System.out.println("输出" + this.voltage);
    }
}
