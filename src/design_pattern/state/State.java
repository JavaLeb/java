package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public abstract class State {
    public abstract void changeState(StateManager stateManager);
    public abstract Color getColor();
}
