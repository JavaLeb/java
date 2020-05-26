package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class RedState extends State {
    @Override
    public void changeState(StateManager stateManager) {
        System.out.println("现在是"+this.getColor());
//       红灯亮5s
        Util.sleep(5);
//        红灯变绿灯
        stateManager.setState(new GreenState());
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
