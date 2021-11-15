package 行为型模式._02_Strategy.策略类群;

/**
 * @ClassName StrategyA
 * @Description 具体策略
 * @Author StarLee
 * @Date 2021/11/14
 */

public class StrategyA implements Strategy {
    public void show() {
        System.out.println("买一送一");
    }
}
