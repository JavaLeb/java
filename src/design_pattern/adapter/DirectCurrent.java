package design_pattern.adapter;

/**
 * Created by leboop on 2020/5/26.
 * 直流电
 */
public class DirectCurrent {
    //    电压
    private String voltage = "5V直流电";

    public void outDC() {
        System.out.println("输出" + this.voltage);
    }
}
