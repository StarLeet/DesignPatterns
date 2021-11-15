package 行为型模式._02_Strategy;

import 行为型模式._02_Strategy.策略类群.Strategy;

/**
 * @ClassName SalesMan
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/14
 */

public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员展示促销活动给用户
    public void salesManShow() {
        strategy.show();
    }
}
