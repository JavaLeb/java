package design_pattern.adapter;


/**
 * Created by leboop on 2020/5/25.
 */
public class AdapterMain {
    public static void main(String[] args) {
//        现在提供交流电
        AlterCurrent alterCurrent = new AlterCurrent();
//        经过充电器交流电变为直流电
        DirectCurrent directCurrent = new CurrentAdapter(alterCurrent);
//        输出直流电
        directCurrent.outDC();
//        手机未插充电器
        Phone phone = new Phone();
        phone.charging();
//        手机插上充电器
        phone.setDirectCurrent(directCurrent);
        phone.charging();
    }
}

class Phone {
    private DirectCurrent directCurrent;

    public Phone() {
    }

    public Phone(DirectCurrent directCurrent) {
        this.directCurrent = directCurrent;
    }

    public void charging() {
        if (directCurrent != null) {
            System.out.println("手机已经插上充电器，正在充电……");
        } else {
            System.out.println("手机还未插入充电器，不在充电，请插上充电器");
        }
    }

    public DirectCurrent getDirectCurrent() {
        return directCurrent;
    }

    public void setDirectCurrent(DirectCurrent directCurrent) {
        this.directCurrent = directCurrent;
    }
}