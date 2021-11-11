package 创建型模式._02_Factory._01_工厂方法模式;

import 创建型模式._02_Factory.CoffeeFactory;
import 创建型模式._02_Factory.咖啡类群.Coffee;
import 创建型模式._02_Factory.咖啡类群.EuropeCoffee;

public class EuropeFactory implements CoffeeFactory {
    @Override
    public Coffee processBeans() {
        System.out.println("欧洲产的咖啡豆研磨完成");
        return new EuropeCoffee("England");
    }
}
