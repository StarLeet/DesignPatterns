package 创建型模式._02_Factory._01_工厂方法模式;

import 创建型模式._02_Factory.CoffeeFactory;
import 创建型模式._02_Factory.咖啡类群.AsianCoffee;
import 创建型模式._02_Factory.咖啡类群.Coffee;

public class AsianFactory implements CoffeeFactory {
    @Override
    public Coffee ProcessBeans() {
        System.out.println("亚洲产的咖啡豆研磨完成");
        return new AsianCoffee("China");
    }
}
