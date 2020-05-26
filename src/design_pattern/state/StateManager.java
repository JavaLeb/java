package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class StateManager {
//    初始状态
    private State state = new GreenState();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 状态管理细节
     */
    public void manage() {
        state.changeState(this);
    }
}
