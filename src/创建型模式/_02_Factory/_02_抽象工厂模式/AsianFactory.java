package 创建型模式._02_Factory._02_抽象工厂模式;

import 创建型模式._02_Factory.CoffeeFactory;
import 创建型模式._02_Factory.DessertFactory;
import 创建型模式._02_Factory.咖啡类群.AsianCoffee;
import 创建型模式._02_Factory.咖啡类群.Coffee;
import 创建型模式._02_Factory.甜品类群.Dessert;
import 创建型模式._02_Factory.甜品类群.MatchMousse;

/**
 * @ClassName AisanFactory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class AsianFactory implements DessertFactory, CoffeeFactory {
    @Override
    public Coffee ProcessBeans() {
        System.out.println("亚洲产的咖啡豆研磨完成");
        return new AsianCoffee("China");
    }

    @Override
    public Dessert createDessert() {
        System.out.println("抹茶慕斯生产完成");
        return new MatchMousse();
    }
}
