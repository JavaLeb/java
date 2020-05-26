package design_pattern.adapter;

/**
 * Created by leboop on 2020/5/26.
 * 适配器：通过组合的方式实现
 */
public class CurrentAdapter extends DirectCurrent {
    private AlterCurrent alterCurrent;

    public CurrentAdapter() {
    }

    public CurrentAdapter(AlterCurrent alterCurrent) {
        this.alterCurrent = alterCurrent;
    }

    @Override
    public void outDC() {
        if (alterCurrent != null) {
//            交流电输出
            alterCurrent.outAC();
//            交流电转换直流电
            System.out.println("交流电转化为直流电");
//            直流电输出
            super.outDC();
        } else {
            System.out.println("充电器未连接交流电，无法输出电流");
        }

    }
}
