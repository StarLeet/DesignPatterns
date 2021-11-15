package 行为型模式._05_State;

import 行为型模式._05_State.状态类群.ClosingState;
import 行为型模式._05_State.状态类群.OpeningState;
import 行为型模式._05_State.状态类群.RunningState;
import 行为型模式._05_State.状态类群.StoppingState;

/**
 * @ClassName Context
 * @Description 环境角色类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Context {
    //定义对应状态对象的常量
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    //设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前状态对象中的Context对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
