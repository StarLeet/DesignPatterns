package 行为型模式._02_Strategy;

import 行为型模式._02_Strategy.策略类群.StrategyA;
import 行为型模式._02_Strategy.策略类群.StrategyB;
import 行为型模式._02_Strategy.策略类群.StrategyC;

/**
 * @ClassName Main
 * @Description 演示策略模式
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Main {
    public static void main(String[] args) {
        //春节来了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("==============");
        //中秋节到了，使用中秋节的促销活动
        salesMan.setStrategy(new StrategyB());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("==============");
        //圣诞节到了，使用圣诞节的促销活动
        salesMan.setStrategy(new StrategyC());
        //展示促销活动
        salesMan.salesManShow();
    }
}
