package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class GreenState extends State {

    @Override
    public void changeState(StateManager stateManager) {
        System.out.println("现在是"+this.getColor());
//        绿灯亮10s
        Util.sleep(10);
//        绿灯变黄灯
        stateManager.setState(new YellowState());
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
