package 行为型模式._05_State;

import 行为型模式._05_State.状态类群.ClosingState;

/**
 * @ClassName Main
 * @Description 演示状态模式
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Main {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯装填
        context.setLiftState(new ClosingState());

        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
