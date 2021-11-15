package 行为型模式._02_Strategy.策略类群;

import 行为型模式._02_Strategy.策略类群.Strategy;

/**
 * @ClassName StrategyB
 * @Description 具体策略类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class StrategyB implements Strategy {
    public void show() {
        System.out.println("满200元减50元");
    }
}
