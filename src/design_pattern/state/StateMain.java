package design_pattern.state;

/**
 * Created by leboop on 2020/5/26.
 */
public class StateMain {
    public static void main(String[] args) {
//        灯
        StateManager stateManager=new StateManager();
        new Thread(()->{
            while (true){
                stateManager.manage();
            }
        },"state-thread").start();

        Car car=new Car();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.go(stateManager.getState().getColor());
        }
    }
}
