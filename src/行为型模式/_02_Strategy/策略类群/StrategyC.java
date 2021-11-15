package 行为型模式._02_Strategy.策略类群;

import 行为型模式._02_Strategy.策略类群.Strategy;

/**
 * @ClassName StrategyC
 * @Description 具体策略类，封装算法
 * @Author StarLee
 * @Date 2021/11/14
 */

public class StrategyC implements Strategy {
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
